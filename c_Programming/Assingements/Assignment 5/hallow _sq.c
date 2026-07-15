//Print a hollow square pattern
//Input: n = 4
#include<stdio.h>
void main()
{
	int n=4;
	for(int n=1; n<=4; n++)
	{
		for (int i=1; i<=4; i++)
		{
			if(n==1 || n==4 || i==1 || i==4)
			printf("* ");
			
			else
			printf("  ");
			
		}
		printf("\n");
	}
}