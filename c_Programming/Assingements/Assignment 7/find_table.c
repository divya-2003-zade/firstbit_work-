#include<stdio.h>
void find_table(int*);
void main()
{
	int num;
	printf("enter a number :");
	scanf("%d",&num);
	find_table(&num);
}
void find_table(int*num)
{
	int i=1 ,r1;
	//printf(" The table of five is ");
	while(i<=10)
	{
		r1=*num*i;
		printf( " % d ",r1);
		i++;
    } 
}