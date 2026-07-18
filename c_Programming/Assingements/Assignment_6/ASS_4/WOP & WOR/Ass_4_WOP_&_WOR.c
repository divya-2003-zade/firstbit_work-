//without parameter and without return type
#include<stdio.h>
void amstrong();
void perfect();                   //function declaration
void prime();
void strong();
void main()
{
	amstrong();
	perfect();                       //function call
    prime(); 
	strong();
}
//Amstrong number
void amstrong()                            //function defination
{
		int n;
	printf("1.Enter a range of amstrong number :");
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
//perfect number
void perfect()          
{
	int n;
	printf("\n\n2. Enter a range of perfect numbmber :");
	scanf("%d",&n);
	 for (int i=1; i<n; i++)
 {
	int sum=0;
	for( int j=1; j<i; j++)
	{
	 if(i%j==0)
	 {
	   sum=sum+j;
	 }
    }
    if(sum==i)
    {
     printf("%d \n",i);
    }
 }
}
// prime number
void prime()   
{
	int n;
	printf("\n\n3.Enter a n  prime Number :");  
	scanf("%d",&n);
	for (int i=2; i<n; i++)
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
		    printf("%d ",i);
	    }
  }
}
//strong number
void strong()          
{
	int n;
	printf("\n\n4. enter a  range of strong number : ");
	scanf("%d",&n);
	for( int i=1; i<=n; i++)
	{
		int temp=i;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int fact=1;
			for(int j=1; j<=rem; j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		{
			printf("%d ",i);
		}
	}
}