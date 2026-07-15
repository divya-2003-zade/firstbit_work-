//Print a half pyramid using numbers
//Input: n = 5
#include<stdio.h>
int main()
{
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=i; j++)
		{
			if(j%1==0)
			printf("%d",j);
			else
			printf("%d",i);
		}
		printf("\n\n");
	}
}