#include<stdio.h>
void find_triangle(int*,int*,int*);
void main()
{
	int a,b,c;
	printf("Enter a side of triangle:");
	scanf("%d%d%d",&a,&b,&c);
	find_triangle(&a,&b,&c);
	
}
void find_triangle(int*a,int*b,int*c)
{
	if(*a==*b &&  *b==*c)
		printf("The triangle is equliteral");// all sides are equal 
	else if(*a == *b || *b == *c || *a == *c)
			printf("The triangle is isosceles");// two side are equal
		else if(*a != *b || *a != *c || *b != *c)
				printf("The triangle is scalene");// all side are different
}