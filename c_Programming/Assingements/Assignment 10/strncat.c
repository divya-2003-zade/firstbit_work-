#include<stdio.h>
#include<string.h>
void main()
{
	char first[30]="Divya ";
	char last[]="zade";
	
	strncat(first , last,3);

	printf("%s ",first);
}