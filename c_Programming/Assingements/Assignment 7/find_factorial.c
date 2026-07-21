#include<stdio.h>
void find_factorial(int*);
void main()
{
	int n;
	printf("Enter a number:");
	scanf("%d",&n);
	find_factorial(&n);
}
void find_factorial(int*n)
{
	int i=1,fact=1;
	while (i<=*n)
	{
		fact=fact*i;
		i++;
	}
	printf(" %d " ,fact);
}