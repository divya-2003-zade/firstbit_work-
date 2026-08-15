#include<stdio.h>
#include<string.h>
void main()
{
	char data[]="Divya,23,cse";
	
	char *token=strtok(data,",");
	
	while(token!=NULL)
	{
		printf("%s\n",token);
		
		token=strtok(NULL,",");
	}
}