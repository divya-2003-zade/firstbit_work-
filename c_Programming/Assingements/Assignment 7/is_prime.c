#include<stdio.h>
#include<stdio.h>
void is_prime(int*);
void main()
{
	int n;
	printf("Enter a n Number :");
	scanf("%d",&n);
	is_prime(&n);
}
void is_prime(int*n)
{
	for (int i=2; i<*n; i++)
 {
	  int flag=1;
   	 for(int j=2; j<i; j++)
   {
		if(i%j==0)
		{
			flag=0;
			break;
		}
	}
	    if(flag==1)
	    {
		    printf("%d  ",i);
	    }
  }
}  
