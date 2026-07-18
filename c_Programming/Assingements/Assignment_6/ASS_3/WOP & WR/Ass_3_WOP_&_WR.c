//without parameter and with return type
#include<stdio.h>
int sum_of_first_last();
int amstrong();
int factorial();
int prime();
int palindrome();            
int perfect();
int strong();
int main()
{
	int res3=sum_of_first_last();
	printf(" sum of first and last digit :%d \n ",res3);
    int	res4=amstrong();
	 if(res4==1)
	printf(" is an Amstrong number \n\n");
    else
        printf(" is not an Amstrong number \n");
    int res5=factorial();
      printf(" number is factorial %d \n",res5);
	int res6=prime();
	if(res6==1)
	 printf("number is prime \n");
	else
	 printf(" number is not prime \n");
	int res7=palindrome(); 
	if(res7==1)
	 printf(" palindrome \n"); 
	else
	 printf("Not palindrome \n");
	int res8=perfect();
	if(res8==1)
	printf("prefect \n");
	else
	printf(" Not perfect \n");
	int res9=strong();
	if(res9==1)
	 printf("strong number \n");
	else
	 printf("not strong number \n");
}
int sum_of_first_last()
{
	int f,l;
	int no=12345;
	int sum;
	l=no%10;
	
	while(no>1)
	{
	  no=no/10;
	}
	f=no;
	sum=f+l;
     return sum;
	
}
//Amstrong number
int amstrong()
{
	int rem, sum=0, org;
	int no=153;
	org=no;
	while(no !=0 )
	{
		
		rem=no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
	}
    if(sum==org)
	    {
		    return 1;
	    }
	    else
	    {
	    return 0;
		}
		
}
//factorial number
int factorial()
{
	int i=1,fact=1,n=5;
	while (i<=n)
	{
		fact=fact*i;
		i++;
	}
	return fact;
}
//prime number
int prime()                 // function defination
{
	int num=7;
	int i=2;
	while(i<num)
	{
		if(num%i==0)
		{
			return 0;
		}
		i++;
	}
	return 1;
}
//palindrome number
int palindrome()
{
    int rev=0,org,rem;
	int no=121;
	org=no;
	while(no != 0)
	{
		rem = no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	if(rev==org)
	{
		return 1;
	}
	else
	{
		return 0;
	}	
} 
//perfect number
int perfect()
{
	int n=28;
	int i=1, sum=0;
	while(i<n)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if (sum==n)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
//strong number
int strong()
{
	int num=145,original_num=num;
	int rem,i=1;
	int fac1=1,fac2=1,fac3=1;
	int sum;
	rem=num%10;
	while(rem>=i)
	{	
	    fac1=fac1*rem;
	    rem--;
	}
	num=num/10;
    rem=num%10;
	while(rem>=i)
	{	
	    fac2=fac2*rem;
	    rem--;
	}
	num=num/10;
	rem=num%10;
	while(rem>=i)
	{	
	    fac3=fac3*rem;
	    rem--;
	}
	sum=fac1+fac2+fac3;
	if(sum==original_num)
	    return 1;
	else
	    return 0;
}