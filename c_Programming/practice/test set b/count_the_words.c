#include<stdio.h>

void main()
{
    char str[100];
    int  words = 1;

    printf("Enter String: ");
    gets(str);

    for(int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ' ')
            words++;
    }

    printf("Number of Words = %d", words);
}