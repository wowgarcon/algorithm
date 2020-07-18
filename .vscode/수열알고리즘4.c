// 피보나치 수열의 합계
// 1+1+2+3+5+8+13+21+.......

#include <stdio.h>

int main()
{
    int a = 1;
    int b = 1;
    int c = 0;
    int cnt = 2;
    int result = a+b;

    while(cnt < 20)
    {
        c = a+b;
        a = b;
        b = c;
        result += c;

        printf("cnt=%d\t c=%d\t a=%d\t b=%d\n",cnt,c,a,b);
        cnt++;
    }
    printf("result=%d", result);

    return 0;
}