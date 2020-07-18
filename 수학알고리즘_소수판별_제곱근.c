//제곱근을 활용하여 소수 판별하기
//소수는 1과 자기자신만을 약수로 가진다.
//소수를 2부터 제곱근까지의 수로 차례로 나누었을 때, 나머지가 0이 되면 소수가 아니다.
//제곱근에서도 나머지가 0이 아니면 소수이다.

#include <stdio.h>
#include <math.h>

int main()
{
    int inputNum;
    int index = 2;

    printf("숫자를 입력하세요 : ");
    scanf("%d", &inputNum);
   
    while(1)
    {
        if(inputNum == 2 || inputNum == -2)         // 2나 -2를 입력한 경우는 소수
        {
            printf("%d는 소수입니다.\n", inputNum);
            break;
        }

        if(inputNum % index == 0)
        {
            printf("%d는 소수가 아닙니다.\n", inputNum);
            break;
        }else
        {
            if(index >= sqrt(inputNum))
            {
                printf("%d는 소수입니다.\n", inputNum);
                break;
            }
            index++;
        }
        
       
    }
    
    return 0;
}