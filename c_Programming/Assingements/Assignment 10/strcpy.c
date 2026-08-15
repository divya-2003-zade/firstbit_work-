#include<stdio.h>
#include<string.h>
void main()
{
	char source[]="Divya";
	char destination[20];
	
	strcpy(destination,source);
	printf("%s",destination);
}