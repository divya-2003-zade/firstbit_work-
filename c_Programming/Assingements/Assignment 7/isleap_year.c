#include<stdio.h>
void isleap_year(int*);
void main ()
{
	
	int yr;
	printf("Enter a year :");
	scanf("%d",&yr);
	isleap_year(&yr);
}
void isleap_year(int*yr)
{
	if(*yr % 4 ==0)
		printf("%d is a leaf year",*yr);
	else
		printf("%d is not a leaf year",*yr);
}