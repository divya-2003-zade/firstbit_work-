#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="1234DIVYA";
	printf("%u",strspn(str,"123456789"));
}