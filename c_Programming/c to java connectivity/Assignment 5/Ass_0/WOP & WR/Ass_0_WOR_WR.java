class Ass_0_WOR_WR
{
public static void main(String args[])
{
	int res1=add();
	System.out.printf("1.Addition of two inegers is %d \n\n",res1);
	double res2=area_of_circle();
	System.out.printf("2.Area of a circle is %f \n\n",res2);
	double res3=temperature();
	System.out.printf("3.Temperature from celsius to Fahrenheit %f \n\n",res3);
    	double res4=avg();
    	System.out.printf("4. Average of five number %f \n\n",res4);
    	int res5=area_of_triangle();
    	System.out.printf("5. Area of a Triangle is %d \n\n",res5);
}

static int add()
{	int a=30, b=20 ,c;
	c= a + b;
	return c;
}
static double area_of_circle()
{
	int r = 3;
	double area;
	area= 3.14*r*r;
	return area;
}
static double temperature()
{
	double c=50.0,f;
	f=(c*9/5)+32;
	return f;
}
static double avg()
{
	int a=10, b=20, c=12, d=15, e=30;
	double avg,sum;
	sum=a+b+c+d+e;
	avg=sum/5;
	return avg;
}
static int area_of_triangle()
{
	int b=10, h=2;
	int tri;
	tri= b*h/2;
	return tri;
	
}
}