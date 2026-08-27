#include<stdio.h>

void main()
{
    char str[100], temp;
    int i;

    printf("Enter String: ");
    gets(str);

    for(i = 0; str[i] != '\0'; i++);
    {
    	temp = str[0];
    str[0] = str[i - 1];
    str[i - 1] = temp;
	}
    printf("New String = %s", str);
}