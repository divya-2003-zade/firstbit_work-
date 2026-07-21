#include<stdio.h>
void iseven_odd(int*);
void main()
{
	
	int no;
	printf("enter a number :");
	scanf("%d",&no);
	iseven_odd(&no);
}
void iseven_odd(int*no)
{
	if(*no%2==0)
		printf("The given number is even");
	else
		printf("The given number is odd");
}