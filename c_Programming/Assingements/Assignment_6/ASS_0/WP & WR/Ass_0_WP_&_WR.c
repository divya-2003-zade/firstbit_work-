//with parameter and with return type
#include<stdio.h>
int add(int,int);
float find_area_of_circle(float);
float find_temperature(float);
float find_avg(int,int,int,int,int);
int find_area_of_triangle(int,int);
int main()
{
	int no1,no2;
	printf("1.Enter a two number:");
	scanf("%d%d",&no1,&no2);
	int res1=add(no1,no2);
	printf("Addition of two inegers is %d \n\n",res1);
	
	float r;
	printf("\n2.Enter a radius:");
	scanf("%f",&r);
	float res2=find_area_of_circle(r);
	printf("Area of a circle is %f \n\n",res2);
	
	float temp;
	printf("\n3.Enter a temperature:");
	scanf("%f",&temp);
	float res3=find_temperature(temp);
	printf("Temperature from celsius to Fahrenheit %f \n\n",res3);
	
	int a,b,c,d,e;
	printf("\n4.Enter a five number:");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
    float res4=find_avg(a,b,c,d,e);
    printf("Average of five number %f \n\n",res4);
    
    int base,hgt;
    printf("5.Enter a base and hight of triangle :");
	scanf("%d%d",&base,&hgt);
    int res5=find_area_of_triangle(base,hgt);
    printf("Area of a Triangle is %d \n\n",res5);
}
int add(int a,int b)
{	int c;
	c= a + b;
	return c;
}
float find_area_of_circle(float r)
{
	float area;
	area= 3.14*r*r;
	return area;
}
float find_temperature(float c)
{
	float f;
	f=(c*9/5)+32;
	return f;
}
float find_avg(int a,int b,int c,int d,int e)
{
	float avg,sum;
	sum=a+b+c+d+e;
	avg=sum/5.0;
	return avg;
}
int find_area_of_triangle(int base,int hgt)
{
	int tri;
	tri= base*hgt/2;
	return tri;
	
}
