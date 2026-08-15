#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="PRATIKSHA";
	
	memmove(str+2,str,3);
	printf("%s",str);
}