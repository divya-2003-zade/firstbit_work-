#include<stdio.h>
void swapping(int*,int*);
void main()
{
	int a,b;
	printf("Enter a two number : ");
	scanf("%d%d",&a,&b);
	swapping(&a,&b);
	
}
void swapping(int*a,int*b)
{
	int	temp=*a;
	     *a=*b;
	     *b=temp;
	printf("swapping of two numbers using a temporary third value \n");
	printf(" a swap value %d \n",*a);
	printf(" b swap value %d \n",*b);
}