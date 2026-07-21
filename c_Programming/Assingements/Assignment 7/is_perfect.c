#include<stdio.h>
void is_perfect(int*);
void main ()
{
	int n;
	printf("Enter a number :");
	scanf("%d",&n);
	is_perfect(&n);
}
void is_perfect(int*n)
{
	int i=1, sum=0;
	while(i<*n)
	{
		if(*n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if (sum==*n)
		printf("%d is prefect number ",*n);
	else
		printf("%d is Not perfect number ",*n);
}