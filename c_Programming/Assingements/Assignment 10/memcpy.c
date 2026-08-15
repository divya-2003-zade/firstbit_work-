#include<stdio.h>
#include<string.h>
void main()
{
	char sou[]="Hello";
	char dest[20];
	
	memcpy(dest,sou,3);
	printf("%s",dest);
	
}