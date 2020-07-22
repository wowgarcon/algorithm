// 버블정렬

#include <stdio.h>

int main()
{
    int num[10] = {3,5,7,1,6,2,9,10,4,8};
    int index;
    int temp;
    int i,j;

    for(index=0; index<sizeof(num); index++)
    {
        for(i=1; i<sizeof(num); i++)
        {
            for(j=0; j<sizeof(num)-1; j++)
            {
                if(num[j] > num[j+1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }

    for(int x=0; x<sizeof(num); x++)
    {
        printf("%d", num[x]);
    }
    return 0;
}