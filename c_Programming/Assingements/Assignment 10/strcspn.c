#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="Divya@!23";
	
	int n=strcspn(str,"@");
	printf("%d",n);
}