#include<stdio.h>
void find_number(int*);
void main()
{
	int n;
	printf("Enter a number : ");
	scanf("%d",&n);
	find_number(&n);
}
void find_number(int*n)
{
	while(*n<=10)
	{
		printf("%d ", *n);
		(*n)++;
	}
}