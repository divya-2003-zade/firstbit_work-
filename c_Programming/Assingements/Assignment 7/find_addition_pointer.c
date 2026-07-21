#include<stdio.h>
void find_add(int*,int*);
void main()
{
	int a,b;
	printf("Enter a two number : ");
	scanf("%d%d",&a,&b);
	find_add(&a,&b);
}
void find_add(int *a,int *b)
{
	int result;
	int *c=&result;
	*c = *a + *b;
	printf("Addition of two inegers is %d",*c);
}