#include <stdio.h>
char* mystrrchr(char *str, char ch)
{
    int i = 0;
    char *last = NULL;

    while(str[i] != '\0')
    {
        if(str[i] == ch)
            last = &str[i];

        i++;
    }

    return last;
}

int main()
{
    char str[50];
    char ch;

    printf("Enter string: ");
    scanf("%s", str);
      
    printf("Enter character to search: ");
    scanf(" %c", &ch);

    char *result = mystrrchr(str, ch);

    if(result != NULL)
        printf("Character found: %s", result);
    else
        printf("Character not found");

    return 0;
}