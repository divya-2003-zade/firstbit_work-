#include<stdio.h>
#include<string.h>
void main()
{
	char source[]="Divya";
	char destination[20];
	
	strncpy(destination,source,3);
	destination[3]='\0';
	printf("%s",destination);
}