#include <stdio.h>

int main()
{
    int n;
    int term = 0;
    int sum = 0;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++)
    {
        term = term * 10 + 1;

        sum = sum + term;

        printf("%d", term);

        if(i < n)
        {
            printf(" + ");
        }
    }

    printf("\nSum = %d", sum);

    return 0;
}