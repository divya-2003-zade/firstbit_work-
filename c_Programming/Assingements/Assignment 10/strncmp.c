#include<stdio.h>
#include<string.h>
void main()
{
	char first[30]="Divya123";
	char last[]="Divya456";
	
	if(strncmp(first,last,6)==0)
	{
		printf("First 5 character same");
	}
	else
	{
		printf("Different");
	}
}