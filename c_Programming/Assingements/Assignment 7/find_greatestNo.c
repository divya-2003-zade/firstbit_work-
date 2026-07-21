#include<stdio.h>
void find_greatestNo(int*,int*,int*);
void main()
{
	int a,b,c;
	printf("Enter a three number to find the greatest No :");
	scanf("%d%d%d",&a,&b,&c);
	find_greatestNo(&a,&b,&c);
}
void find_greatestNo(int*a,int*b,int*c)
{
	if (*a>*b)
		if (*a>*c)
			printf("The greates no. is a %d",*a);
		else
			printf("The greates no. is c %d",*c);
	else
		if (*b>*c)
			printf("The greates no. is b %d",*b);
		else
			printf("The greates no. is c %d",*c);
}