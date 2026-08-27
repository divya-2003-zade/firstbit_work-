#include<stdio.h>

void main()
{
    char str[100];
    printf("Enter String: ");
    gets(str);
    for(int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ' ')
            str[i] = '*';
    }
    printf("New String = %s", str);
}