//Print a half pyramid using numbers
//Input: n = 5
#include<stdio.h>
int main()
{
	for (int r=1; r<=5; r++)
	{
		for (int c=1; c<=r; c++)
		{
			printf("%d",c);
    	}
		printf("\n");
	}
	
}