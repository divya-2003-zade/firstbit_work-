//Print a right-angled triangle pattern
//Input: n = 5
#include<stdio.h>
int main()
{
	for(int i=1; i<=5; i++)
	{
		for(int n=1; n<=i; n++)
		{
			printf("*");
		}
		printf("\n\n");
	}
}