#include<stdio.h>

void main()
{
    char str[100];
    int i, n;

    printf("Enter String: ");
    gets(str);

    printf("Enter Index: ");
    scanf("%d", &n);

    for(i = n; str[i] != '\0'; i++)
    {
        str[i] = str[i + 1];
    }

    printf("New String = %s", str);
}