#include <stdio.h>

int main()
{
    char str[100];
    int j = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    for(int i = 0; str[i] != '\0'; i++)
    {
        if(i % 2 == 0)
        {
            str[j] = str[i];
            j++;
        }
    }

    str[j] = '\0';

    printf("New string is: %s", str);

    return 0;
}