//1. Print armstrong numbers in the given range 1 to n.
//amstrong number
#include<stdio.h>
int main()
{
	int n;
	printf("Enter a number :");
	scanf("%d",&n);
	for(int i=1; i<=n; i++)
    {
        int temp = i;
        int count = 0;
        int sum = 0;
	  for (int j=i; j>0; j=j/10)
	  {
		count++;
      }
	  for( int j=i; j>0; j=j/10)
	   {
		  int rem=j%10;
		  int x=1;
		  for (int k=1; k<=count; k++)
		  {
			  x=x*rem;
		  }
		   sum=sum+x;
 	   }
	    if(sum==temp)
	    printf("%d  ",temp); 
   }
}

	