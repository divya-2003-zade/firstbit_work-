class Ass_0
{
public static void main(String args[])
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
public static void add()
{
	int a=30, b=20 ,c;
	c = a + b;
	System.out.printf("1 .");
	System.out.printf("Addition of two inegers is %d \n\n",c);
}
public static void area_of_circle()
{
	int r = 3;
	double area;
	area= 3.14*r*r;
	System.out.printf("2 .");
	System.out.printf("Area of a circle is %f \n\n",area);
}
public static void temperature()
{
	int c=50;
	double f;
	f=(c*9/5)+32;
	System.out.printf("3 .");
	System.out.printf("Temperature from celsius to Fahrenheit %f \n\n",f);
}
public static void swap_no()
{
	int a=15, b=25,c;
	c=a;
	a=b;
	b=c;
	System.out.printf("4 .");
	System.out.printf("swapping of two numbers using a temporary third value \n");
	System.out.printf(" a swap value %d \n",a);
	System.out.printf(" b swap value %d \n\n",b);
}
public static void avg()
{
	int a=10, b=20, c=12, d=15, e=30;
	double avg,sum;
	sum=a+b+c+d+e;
	avg=sum/5;
	System.out.printf("5 .");
	System.out.printf("Average of five number %f \n\n",avg);
}
public static void sq_cube()
{
	int r=5;
	int sq, cu;
	sq=r*r;
	cu=r*r*r;
	System.out.printf("6 .");
	System.out.printf("Square of %d is %d \n",r,sq);
	System.out.printf("Cube of %d is %d \n\n",r,cu);
}
public static void time()
{
	int min,Hr,rea_min;  
	min = 150;
	Hr = min / 60;
	rea_min = min % 60;
	System.out.printf("7 .");
	System.out.printf("%d minutes means %d hours \n",min,Hr);
	System.out.printf("Remaining minutes in the %d minutes is %d minutes \n",min,rea_min);
	System.out.printf("Total time will be %d minute = %d hours and %d remaining minutes \n\n",min,Hr,rea_min);
}
public static void perimeter_of_rec()
{
	int l=5, b=7;
	int R, P;
	R = l*b;
	P = 2*l+2*b;
	System.out.printf("8 .");
	System.out.printf("Area of a Recangle is %d \n",R);
	System.out.printf("Perimeter of a Rectangle is %d \n\n",P);
}
public static void area_of_triangle()
{
	int b=10, h=2;
	int tri;
	tri= b*h/2;
	System.out.printf("9 .");
	System.out.printf("Area of a Triangle is %d \n\n",tri);
}
public static void marks_of_sub()
{
	int eng=80 , math=70, hindi=75, sci=65, mar=80;
	double sum;
	double per;
	sum=eng+math+hindi+sci+mar;
	per=sum/500*100;
	System.out.printf("10 .");
	System.out.printf("Total marks will be %f \n",sum);
	System.out.printf("Percentage will be %f \n" ,per);
}
}