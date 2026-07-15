//Check the given number is Strong number or not.
//Input: n = 145
//strong number
#include<stdio.h>
void main()
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