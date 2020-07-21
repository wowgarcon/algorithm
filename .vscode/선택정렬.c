// 선택정렬

#include <stdio.h>

int main()
{
    int num[10] = {3,5,7,1,6,2,9,10,4,8};
    int min;
    int temp;
    int i,j;

    for(i=0; i<sizeof(num); i++)
    {
        for(j=i+1; j<sizeof(num); j++)
        {
            if(num[i] > num[j])
            {
                temp = num[i];
                num[i] = num[j];
                num[j] = num[i];
            }
        }
    }

    for(int x=0; x<sizeof(num); x++)
    {
        printf("%d", num[x]);
    }
    return 0;
}