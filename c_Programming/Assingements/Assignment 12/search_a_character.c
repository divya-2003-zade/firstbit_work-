#include<stdio.h>

void main()
{
    char str[100], ch;
    int i, found = 0;

    printf("Enter String: ");
    gets(str);

    printf("Enter Character to Search: ");
    scanf("%c", &ch);

    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ch)
        {
            printf("Character found at index %d\n", i);
            found = 1;
        }
    }

    if(found == 0)
        printf("Character not found");
}