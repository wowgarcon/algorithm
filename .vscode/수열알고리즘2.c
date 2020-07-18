// 항이 바뀔 때마다 빼기와 더하기가 번갈아 나열되는 수열
// -1+2-4+7-11+16-22+..........

#include <stdio.h>

int main()
{
    int i=0;
    int j=1;
    int k=0;
    int l=1;

    do
    {
        j += i;
        l *= -1;
        k += j*l;
        i++;
    } while (i<20);
    printf("%d", k);

    return 0;
}