//Print a pattern of stars in diamond shape
//Input: n = 4
#include<stdio.h>
int main()
{
	for (int r=1; r<=4; r++)
	{
	
	    /*for(int s = 1; s <= 4 - r; s++)
          {
            printf(" ");
          }*/
        
		for (int c=1; c<=r; c++)
		{
			printf("*");
    	}
		   

		printf("\n");
	}
	for (int r=3; r>=1; r--)
	{
	
	    /*for(int s = 1; s <= 4-r; s++)
          {
            printf(" ");
          }*/
        
		for (int c=1; c<=r; c++)
		{
			printf("*");
    	}
		   

		printf("\n");
	}
	
	
}