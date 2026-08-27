#include<stdio.h>

void main()
{
    char str1[100], str2[100];
    int i, len1 = 0, len2 = 0;

    printf("Enter First String: ");
    gets(str1);

    printf("Enter Second String: ");
    gets(str2);

    for(i = 0; str1[i] != '\0'; i++)
        len1++;

    for(i = 0; str2[i] != '\0'; i++)
        len2++;

    if(len1 > len2)
        printf("Larger String = %s", str1);
    else if(len2 > len1)
        printf("Larger String = %s", str2);
    else
        printf("Both Strings are Equal");
}