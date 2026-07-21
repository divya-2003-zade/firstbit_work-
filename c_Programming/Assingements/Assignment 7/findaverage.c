#include<stdio.h>
void findaverage(int*,int*,int*,int*,int*);
void main()
{
	int a,b,c,d,e;
	printf("Enter a five value : ");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	findaverage(&a,&b,&c,&d,&e);
	
}
void findaverage(int*a,int*b,int*c,int*d,int*e)
{
	int sum=(*a)+(*b)+(*c)+(*d)+(*e);
	float avg=sum/5;
	printf("Average of five number %f",avg);
}