//with parameter and with return type
#include<stdio.h>
int sum_of_first_last(int);
int amstrong(int);
int factorial(int);
int prime(int);
int palindrome(int);            
int perfect(int);
int strong(int);
int main()
{
	int a,b,c,d,e,f,g;
	printf("1.Enter a number: ");
	scanf("%d",&a);
	int res3=sum_of_first_last(a);
	printf(" sum of first and last digit :%d \n ",res3);
	printf("\n2.Enter a number: ");
	scanf("%d",&b);
    int	res4=amstrong(b);
	 if(res4==1)
	printf("%d is an Amstrong number \n\n",b);
    else
        printf("%d is not an Amstrong number \n",b);
        printf("\n3.Enter a number: ");
	scanf("%d",&c);
    int res5=factorial(c);
      printf("%d is factorial %d \n",c,res5);
      printf("\n4.Enter a number: ");
	scanf("%d",&d);
	int res6=prime(d);
	if(res6==1)
	 printf("%d number is prime \n",d);
	else
	 printf("%d number is not prime \n",d);
	 printf("\n5.Enter a number: ");
	scanf("%d",&e);
	int res7=palindrome(e); 
	if(res7==1)
	 printf("%d is palindrome number \n",e); 
	else
	 printf("%d is Not palindrome number \n",e);
	 printf("\n6.Enter a number: ");
	scanf("%d",&f);
	int res8=perfect(f);
	if(res8==1)
	printf("%d is prefect number \n",f);
	else
	printf("%d is Not perfect number \n",f);
	printf("\n7.Enter a number: ");
	scanf("%d",&g);
	int res9=strong(g);
	if(res9==1)
	 printf("%d strong number \n",g);
	else
	 printf("%d not strong number \n",g);
}
int sum_of_first_last(int no)
{
	int f,l;
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
int amstrong(int no)
{
	int rem, sum=0, org;
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
int factorial(int n)
{
	int i=1,fact=1;
	while (i<=n)
	{
		fact=fact*i;
		i++;
	}
	return fact;
}
//prime number
int prime(int num)                 // function defination
{
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
int palindrome(int no)
{
    int rev=0,org,rem;
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
int perfect(int n)
{
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
int strong(int num)
{
	int original_num=num;
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