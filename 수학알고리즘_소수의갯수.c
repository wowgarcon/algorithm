// 2~100까지의 소수 갯수 파악하기

#include <stdio.h>

int main()
{
    int Arr[99];
    int primeNum_cnt=0;
    int index = 2;

    for(int i=0; i<sizeof(Arr); i++)
    {
        if(index == 2)
        {
            Arr[i] = 0;
            primeNum_cnt++;
        }
        
        if(index > 2)
        {
            int k = 2;
            while(k <= index)
            {
                if(index % k == 0)
                {
                    if(k == index)
                    {
                        primeNum_cnt++;
                    }else
                    {
                        k++;
                    }
                }else
                {
                    k++;
                }
            }
        }
        index++;
    }
    return 0;
}