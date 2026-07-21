#include<stdio.h>
void start_end(int*,int*);
void main()
{
	
	int start,end;
	printf("enter a start number and end number :");
	scanf("%d%d",&start,&end);
	start_end(&start,&end);
}
void start_end(int*start,int*end)
{
	int sum=0;
	while ( *start <= *end)
	{
		sum=sum+*start;
		(*start)++;
	}
	printf("sum = %d ", sum);
}