//without parameter and without return type
#include<stdio.h>
void add();
void area_of_circle();
void temperature();
void swap_no();
void avg();
void sq_cube();
void time();
void perimeter_of_rec();
void area_of_triangle();
void marks_of_sub();
void main()
{
	add();
	area_of_circle();
	temperature();
    swap_no();
    avg();
    sq_cube();
    time();
    perimeter_of_rec();
    area_of_triangle();
    marks_of_sub();
}
void add()
{
	int a=30, b=20 ,c;
	c = a + b;
	printf("1 .");
	printf("Addition of two inegers is %d \n\n",c);
}
void area_of_circle()
{
	int r = 3;
	float area;
	area= 3.14*r*r;
	printf("2 .");
	printf("Area of a circle is %f \n\n",area);
}
void temperature()
{
	int c=50;
	float f;
	f=(c*9/5)+32;
	printf("3 .");
	printf("Temperature from celsius to Fahrenheit %f \n\n",f);
}
void swap_no()
{
	int a=15, b=25,c;
	c=a;
	a=b;
	b=c;
	printf("4 .");
	printf("swapping of two numbers using a temporary third value \n");
	printf(" a swap value %d \n",a);
	printf(" b swap value %d \n\n",b);
}
void avg()
{
	int a=10, b=20, c=12, d=15, e=30;
	float avg,sum;
	sum=a+b+c+d+e;
	avg=sum/5;
	printf("5 .");
	printf("Average of five number %f \n\n",avg);
}
void sq_cube()
{
	int r=5;
	int sq, cu;
	sq=r*r;
	cu=r*r*r;
	printf("6 .");
	printf("Square of %d is %d \n",r,sq);
	printf("Cube of %d is %d \n\n",r,cu);
}
void time()
{
	int min,Hr,rea_min;  
	min = 150;
	Hr = min / 60;
	rea_min = min % 60;
	printf("7 .");
	printf("%d minutes means %d hours \n",min,Hr);
	printf("Remaining minutes in the %d minutes is %d minutes \n",min,rea_min);
	printf("Total time will be %d minute = %d hours and %d remaining minutes \n\n",min,Hr,rea_min);
}
void perimeter_of_rec()
{
	int l=5, b=7;
	int R, P;
	R = l*b;
	P = 2*l+2*b;
	printf("8 .");
	printf("Area of a Recangle is %d \n",R);
	printf("Perimeter of a Rectangle is %d \n\n",P);
}
void area_of_triangle()
{
	int b=10, h=2;
	int tri;
	tri= b*h/2;
	printf("9 .");
	printf("Area of a Triangle is %d \n\n",tri);
}
void marks_of_sub()
{
	int eng=80 , math=70, hindi=75, sci=65, mar=80;
	float sum;
	float per;
	sum=eng+math+hindi+sci+mar;
	per=sum/500*100;
	printf("10 .");
	printf("Total marks will be %f \n",sum);
	printf("Percentage will be %f \n" ,per);
}