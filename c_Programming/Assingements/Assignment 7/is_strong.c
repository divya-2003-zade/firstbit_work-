#include<stdio.h>
void is_strong(int*);
void main()
{
	int num;
	printf("enter a number :");
	scanf("%d",&num);
	is_strong(&num);
}
void is_strong(int*num)
{
	int rem,i=1,original_num=*num;;
	int fac1=1,fac2=1,fac3=1;
	int sum;
	rem=*num%10;
	while(rem>=i)
	{	
	    fac1=fac1*rem;
	    rem--;
	}
	*num=*num/10;
    rem=*num%10;
	while(rem>=i)
	{	
	    fac2=fac2*rem;
	    rem--;
	}
	*num=*num/10;
	rem=*num%10;
	while(rem>=i)
	{	
	    fac3=fac3*rem;
	    rem--;
	}
	sum=fac1+fac2+fac3;
	if(sum==original_num)
	    printf("%d is strong number \n",original_num);
	else
	    printf("%d is not strong number \n",original_num);
	
}