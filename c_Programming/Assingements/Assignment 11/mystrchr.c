#include <stdio.h>

char* mystrchr(char *str, char ch)
{
    int i = 0;

    while(str[i] != '\0')
    {
        if(str[i] == ch)
        {
            return &str[i];
        }

        i++;
    }

    return NULL;
}

int main()
{
    char str[50];
    char ch;

    printf("Enter string: ");
    scanf("%s", str);
      
    printf("Enter character to search: ");
    scanf(" %c", &ch);

    char *result = mystrchr(str, ch);

    if(result != NULL)
        printf("Character found: %s", result);
    else
        printf("Character not found");

    return 0;
}