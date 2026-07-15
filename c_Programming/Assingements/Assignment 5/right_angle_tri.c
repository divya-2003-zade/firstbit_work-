//Print an inverted right-angled triangle pattern
//Input: n = 5
#include<stdio.h>
int main()
{
	for(int n=5; n>=1; n--)
	{
		for(int m=1; m<=n; m++)
		{
			printf("*");
		}
		printf("\n\n");
	}
}