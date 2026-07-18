//with parameter and without return type
#include<stdio.h>
void add(int,int);
void find_area_of_circle(float);
void find_temperature(float);
void find_avg(int,int,int,int,int);
void find_area_of_triangle(int,int);
void main()
{
	int no1,no2;
	printf("1.Enter a two number:");
	scanf("%d%d",&no1,&no2);
	add(no1,no2);
	
	
	float r;
	printf("\n2.Enter a radius:");
	scanf("%f",&r);
	find_area_of_circle(r);
	
	
	float temp;
	printf("\n3.Enter a temperature:");
	scanf("%f",&temp);
	find_temperature(temp);
	
	
	int a,b,c,d,e;
	printf("\n4.Enter a five number:");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
    find_avg(a,b,c,d,e);
    
    
    int base,hgt;
    printf("5.Enter a base and hight of triangle :");
	scanf("%d%d",&base,&hgt);
    find_area_of_triangle(base,hgt);
    
}
void add(int a,int b)
{	int c;
	c= a + b;
	printf("Addition of two inegers is %d \n\n",c);
}
void find_area_of_circle(float r)
{
	float area;
	area= 3.14*r*r;
	printf("Area of a circle is %f \n\n",area);
}
void find_temperature(float c)
{
	float f;
	f=(c*9/5)+32;
	printf("Temperature from celsius to Fahrenheit %f \n\n",f);
}
void find_avg(int a,int b,int c,int d,int e)
{
	float avg,sum;
	sum=a+b+c+d+e;
	avg=sum/5.0;
	printf("Average of five number %f \n\n",avg);
}
void find_area_of_triangle(int base,int hgt)
{
	int tri;
	tri= base*hgt/2;
	printf("Area of a Triangle is %d \n\n",tri);
	
}
