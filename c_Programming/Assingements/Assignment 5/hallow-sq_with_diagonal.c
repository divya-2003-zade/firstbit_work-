//Print a hollow square with diagonal pattern
//Input: n = 5
#include<stdio.h>
int main()
{
	for( int r=1; r<=5; r++)
	{
		for(int c=1; c<=5; c++)
		{
			if(r==1 ||r==5 || c==1 || c==5 ||r==c)
			printf("* ");
			else
			printf("  ");
		}
		printf("\n");
	}
}