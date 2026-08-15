#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="hello world";
	char*ptr=strrchr(str,'o');
	
	if(ptr!=NULL)
	{
		printf("Last o = %s",ptr);
	}
	else
	{
		printf("not found");
	}
}