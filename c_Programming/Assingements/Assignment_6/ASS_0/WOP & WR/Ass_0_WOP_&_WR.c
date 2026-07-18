//without parameter and with return type
#include<stdio.h>
int add();
float area_of_circle();
float temperature();
float avg();
int area_of_triangle();
int main()
{
	int res1=add();
	printf("1.Addition of two inegers is %d \n\n",res1);
	float res2=area_of_circle();
	printf("2.Area of a circle is %f \n\n",res2);
	float res3=temperature();
	printf("3.Temperature from celsius to Fahrenheit %f \n\n",res3);
    float res4=avg();
    printf("4. Average of five number %f \n\n",res4);
    int res5=area_of_triangle();
    printf("5. Area of a Triangle is %d \n\n",res5);
}
int add()
{	int a=30, b=20 ,c;
	c= a + b;
	return c;
}
float area_of_circle()
{
	int r = 3;
	float area;
	area= 3.14*r*r;
	return area;
}
float temperature()
{
	float c=50.0,f;
	f=(c*9/5)+32;
	return f;
}
float avg()
{
	int a=10, b=20, c=12, d=15, e=30;
	float avg,sum;
	sum=a+b+c+d+e;
	avg=sum/5;
	return avg;
}
int area_of_triangle()
{
	int b=10, h=2;
	int tri;
	tri= b*h/2;
	return tri;
	
}
