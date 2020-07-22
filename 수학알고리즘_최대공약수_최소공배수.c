// 최대공약수와 최소공배수를 구하자.

#include <stdio.h>

int main()
{
    int inputNum_A, inputNum_B, big, small, gcm, lcm;

    printf("첫번째 수를 입력하세요 : ");
    scanf("%d", &inputNum_A);
    printf("두번째 수를 입력하세요 : ");
    scanf("%d", &inputNum_B);

    if(inputNum_A > inputNum_B)
    {
        big = inputNum_A;
        small = inputNum_B;
    }else{
        big = inputNum_B;
        small = inputNum_A;
    }

    while(1)
    {
        int nameoji = big % small;
        if (nameoji = 0)
        {
            gcm = small;
            lcm = (inputNum_A * inputNum_B) / small;
            printf("최소공약수 = %d, 최대공배수 = %d", gcm, lcm);
            break;
        }else
        {
            big = small;
            small = nameoji;
        }
    }

    return 0;
}