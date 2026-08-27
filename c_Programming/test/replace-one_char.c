#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("Enter a string : ");
	fgets(str,sizeof(str),stdin);
	
	for(int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == 'a')
            str[i] = '$';
    }
    printf("New string is :%s",str);
}