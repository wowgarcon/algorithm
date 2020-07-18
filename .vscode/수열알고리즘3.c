// 팩토리얼의 합계
// 1!+2!+3!+4!+.............

#include <stdio.h>

int main()
{
    int i=0;
    int j=1;
    int k=0;

    do
    {
        i++;
        j *= i;
        k += j;

        printf("i=%d\t j=%d\t k=%d\n",i,j,k);
    } while (i<10);
    printf("%d", k);

    return 0;
}