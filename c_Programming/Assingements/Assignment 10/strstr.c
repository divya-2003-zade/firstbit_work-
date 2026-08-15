#include<stdio.h>
#include<string.h>
void main()
{
	char substring[]="I am learning c programming";
	
	if(strstr(substring,"programming")!=NULL)
	{
		printf("found");
	}
	else
	{
		printf("Not found");
	}
}