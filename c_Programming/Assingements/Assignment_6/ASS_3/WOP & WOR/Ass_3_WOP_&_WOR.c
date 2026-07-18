//without parameter and without return type
#include<stdio.h>
void number();              //function declaration
void table_OF_5();
void sum_of_first_last();
void amstrong();
void factorial();
void prime();
void palindrome();            
void perfect();
void strong();
void main()
{
	number();                      //function call
	table_OF_5();
	sum_of_first_last();
	amstrong();
	factorial();
	prime();
	palindrome();         
	perfect();
	strong();
}
//number from 1 to 10
void number()                    //function defination
{
	int n=1;
	printf("Number from 1 to 10 :");
	while(n<=10)
	{
		printf("  % d \n", n);
		n++;
	}
}
// Table of 5
void table_OF_5()
{
	int num=5;
	int i=1 ,r1;
	printf(" The table of five is : ");
	while(i<=10)
	{
		r1=num*i;
		printf( " % d \n ",r1);
		i++;
		
    } 
} 
// sum of first and last digit
void sum_of_first_last()
{
	int f,l;
	int no=12345;
	int sum;
	l=no%10;
	printf(" sum of first and last digit :");
	while(no>1)
	{
	  no=no/10;
	}
	f=no;
	sum=f+l;
	printf("%d (%d + %d) \n", sum,f,l);
}
//Amstrong number
void amstrong()
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
		    printf(" %d is an Amstrong number \n",org);
	    }
	    else
	    {
	    	printf("not amstrong \n");
		}
}
//factorial number
void factorial()
{
	int i=1,fact=1,n=5;
	while (i<=n)
	{
		fact=fact*i;
		i++;
	}
	printf(" %d  factorial is : %d \n",n ,fact);
}
//prime number
void prime()                 // function defination
{
	int num=7;
	int i=2;
	while(i<num)
	{
		if(num%i==0)
		{
			printf("not prime \n");
		}
		i++;
	}
	printf("prime");
	printf("\n \n");
}
//palindrome number
void palindrome()
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
		printf(" palindrome \n");
	}
	else
	{
		printf("Not palindrome \n");
	}	
} 
//perfect number
void perfect()
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
		printf("prefect \n");
	}
	else
	{
		printf(" Not perfect \n");
	}
}
//strong number
void strong()
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
	    printf("strong number \n");
	else
	    printf("not strong number \n");
	
}