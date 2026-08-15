#include<stdio.h>
#include<string.h>
void main()
{
	char first[30]="Divya ";
	char last[]="zade";
	
	if(strcmp(first,last)==0)
	{
		printf("Both are same");
	}
	else
	{
		printf("Different");
	}
}