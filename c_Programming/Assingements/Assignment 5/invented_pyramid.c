//Print an inverted pyramid pattern
//Input: n = 5
#include<stdio.h>
int main()
{
	for(int r=5; r>=1; r--)
	{
		for ( int s=1; s<=6-r; s++)
		{
			printf(" ");
		}
		for(int c=1; c<=r; c++)
		{
			printf("*");
			
		}
		
		printf("\n");
	}
	
}