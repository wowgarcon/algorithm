// 항 사이의 증가값이 일정한 비율로 증가하는 수열
// -1+2-4+7-11+16-22+..........

#include <stdio.h>

int main()
{
    int i=0;
    int j=1;
    int k=1;

    do
    {
        i++;
        j += i;
        k += j;
    } while (i<19);
    printf("%d", k);

    return 0;
}