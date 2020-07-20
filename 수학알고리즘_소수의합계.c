//입력한 정수 안에 포함된 소수의 합 구하기 (2~정수까지의 합)

#include <stdio.h>

int main()
{
    int inputNum;
    int index = 2;
    int total=0;

    printf("숫자를 입력하세요 : ");
    scanf("%d", &inputNum);
   
    while(1)
    {
        int multiplied_var = 2;

        while(index % multiplied_var != 0)
        {
            multiplied_var++;
        }
        
        if(index == multiplied_var)
        {
            total += inputNum;
        }
        
        if(index < inputNum)
        {
            index++;
        }else
        {
            printf("total = %d\n", total); 
            break;
        }
        
    }
    
    return 0;
}