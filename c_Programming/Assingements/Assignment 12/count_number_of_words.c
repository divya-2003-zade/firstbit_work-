#include<stdio.h>

void main()
{
    char str[100];
    int i, words = 1;

    printf("Enter String: ");
    gets(str);

    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ' ')
            words++;
    }

    printf("Number of Words = %d", words);
}