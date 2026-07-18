//with parameter and without return type
#include<stdio.h>
void number(int);              //function declaration
void table_OF_5(int);
void sum_of_first_last(int);
void amstrong(int);
void factorial(int);
void prime(int);
void palindrome(int);            
void perfect(int);
void strong(int);
void main()
{
	int a=1,b=5,c=12345,d=153,e=5,f=7,g=121,h=28,i=145;
	printf("1.Enter starting number for 1 to 10: ");
    scanf("%d", &a);
	number(a);  
	
     printf("\n 2.Enter a number for table: ");
    scanf("%d", &b);           //function call
    table_OF_5(b);
    
    printf("\n 3.Enter a number for sum of first and last digit: ");
    scanf("%d", &c);
	sum_of_first_last(c);
	
	printf("\n 4.Enter a number to check Armstrong: ");
    scanf("%d", &d);
	amstrong(d);
	
	printf("\n 5.Enter a number to find factorial: ");
    scanf("%d", &e);
	factorial(e);
	
	printf("\n 6.Enter a number to check Prime: ");
    scanf("%d", &f);
	prime(f);
	
    printf("\n 7.Enter a number to check Palindrome: ");
    scanf("%d", &g);
	palindrome(g); 
	
	printf("\n 8.Enter a number to check Perfect: ");
    scanf("%d", &h);        
	perfect(h);
	
	printf("\n 9.Enter a number to check Strong: ");
    scanf("%d", &i);
	strong(i);
}
//number from 1 to 10
void number(int x)                    //function defination
{
	printf("Number from 1 to 10 :");
	while(x<=10)
	{
		printf("%d ", x);
		x++;
	}
}
// Table of 5
void table_OF_5(int y)
{
	int i=1 ,r1;
	
	printf("The table of %d is : ",y);
	while(i<=10)
	{
		r1=y*i;
		printf( " % d ",r1);
		i++;
		
    } 
} 
// sum of first and last digit
void sum_of_first_last(int s)
{
    int first, last;
    last = s % 10;
    while(s >= 10)
    {
        s = s / 10;
    }
    first = s;
    printf("Sum of first and last digit: %d (%d + %d)\n",
           first + last, first, last);
}
//Amstrong number
void amstrong(int r)
{
	int rem, sum=0;
	int temp=r;
	while(temp !=0 )
	{
		
		rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
    if(sum==r)
	    {
		    printf(" %d is an Amstrong number \n",r);
	    }
	    else
	    {
	    	printf("%d is not an amstrong \n",r);
		}
}
//factorial number
void factorial(int t)
{
	int i=1,fact=1;
	while (i<=t)
	{
		fact=fact*i;
		i++;
	}
	printf(" %d  factorial is : %d \n",t ,fact);
}
// Prime Number
void prime(int n)
{
    int i = 2;
    int flag = 1;

    while(i < n)
    {
        if(n % i == 0)
        {
            flag = 0;
            break;
        }
        i++;
    }
    if(n <= 1)
        flag = 0;

    if(flag == 1)
        printf("%d is Prime Number \n", n);
    else
        printf("%d is Not Prime Number \n", n);
}
//palindrome number
void palindrome(int j)
{
    int rev=0,rem;
	int temp=j;
	while(temp != 0)
	{
		rem = temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(rev==j)
	{
		printf(" %d is palindrome \n",j);
	}
	else
	{
		printf("%d is Not palindrome \n",j);
	}	
} 
//perfect number
void perfect(int k)
{
	int i=1, sum=0;
	while(i<k)
	{
		if(k%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if (sum==k)
	{
		printf("%d is a prefect number \n",k);
	}
	else
	{
		printf("%d is  Not perfect number \n",k);
	}
}
//strong number
void strong(int v)
{
	int temp=v;
	int rem,i=1;
	int fac1=1,fac2=1,fac3=1;
	int sum;
	rem=temp%10;
	while(rem>=i)
	{	
	    fac1=fac1*rem;
	    rem--;
	}
	temp=temp/10;
    rem=temp%10;
	while(rem>=i)
	{	
	    fac2=fac2*rem;
	    rem--;
	}
	temp=temp/10;
	rem=temp%10;
	while(rem>=i)
	{	
	    fac3=fac3*rem;
	    rem--;
	}
	sum=fac1+fac2+fac3;
	if(sum==v)
	    printf("%d is a strong number \n",v);
	else
	    printf("%d is not strong number \n",v);
	
}