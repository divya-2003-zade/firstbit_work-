#include<stdio.h>
#include<string.h>
void main()
{
	char email[]="divyazade82@gmail.com";
	char*ptr=strchr(email,'@');
	
	if(ptr!=NULL)
	{
		printf("@ found");
	}
	else
	{
		printf("not found");
	}
}