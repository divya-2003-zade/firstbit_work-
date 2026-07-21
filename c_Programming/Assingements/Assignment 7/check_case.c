#include<stdio.h>
void check_case(char*);
void main()
{
	
	char ch;
	printf("Enter a characters :");
	scanf("%c",&ch);
	check_case(&ch);
}
void check_case(char*ch)
{
	if(*ch >= 'a' && *ch <= 'z')
        printf("%c is lowercase.", *ch);
    else if(*ch >= 'A' && *ch <= 'Z')
        printf("%c is uppercase.", *ch);
    else
        printf("%c is not an alphabet.", *ch);
}
