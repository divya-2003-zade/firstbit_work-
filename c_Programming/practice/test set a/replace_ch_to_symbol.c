#include<stdio.h>

void main()
{
    char str[100];
    char ch;
    int i;

    printf("Enter String: ");
    gets(str);
    
     printf("Enter character to replace: ");
    scanf("%c", &ch);

    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ch)
            str[i] = '$';
    }

    printf("New String = %s", str);
}