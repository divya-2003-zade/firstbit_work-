#include<stdio.h>
void find_areaoftriangle(int*,int*);
void main()
{
	int b,h;
	printf("Enter a base and height of triangle:");
	scanf("%d%d",&b,&h);
	find_areaoftriangle(&b,&h);
	
}
void find_areaoftriangle(int*b,int*h)
{
	int tri= (*b)*(*h)/2;
	printf("Area of a Triangle is %d ",tri);
}