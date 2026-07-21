#include<stdio.h>
void find_sum(int*);
void main()
{
	int no;
	printf(" Enter a number :");
	scanf("%d",&no);
	find_sum(&no);
}
void find_sum(int*no)
{
	int f,l,sum;
	l=*no%10;
	while(*no>1)
	{
	  *no=*no/10;
	}
	f=*no;
	sum=f+l;
	printf("%d (%d + %d) ", sum,f,l);
}