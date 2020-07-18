//소수 판별하기
//소수는 1과 자기자신만을 약수로 가진다.
//소수를 2부터 소수-1까지의 수로 차례로 나누었을 때, 나머지가 0이 되면 소수가 아니다.

#include <stdio.h>

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

        if(inputNum % index == 0)                   // 나머지가 0이면 소수가 아니다.
        {
            printf("%d는 소수가 아닙니다.\n", inputNum);
            break;
        }else                                       // 나머지가 0이 아니면 소수일 가능성이 있다.
        {
            index++;                                // 나눌 수를 +1하여 다시 반복
            if(index >= inputNum)                   // 입력한 수와 제수가 같아질때까지 반복되었다면 소수.
            {
                printf("%d는 소수입니다.\n", inputNum);
                break;
            }
        }
    }
    
    return 0;
}