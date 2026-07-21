#include<stdio.h>
void find_Age(int*);
void main()
{
	int age;
	printf("Enter a age of person :");
	scanf("%d",&age);
	find_Age(&age);
}
void find_Age(int*age)
{
	if(*age >= 18)
		printf(" Person is eligible for the vote");
	else
		printf(" Person is  not eligible for the vote");
}