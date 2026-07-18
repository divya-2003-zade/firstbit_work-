//With Parameter and With Return Type
#include<stdio.h>
int category_age(int);
int divisibility(int);                       //function declaration
int greatest_no(int,int, int);
int operation_on_operator(int, int,char);
double find_price(double,char);
int find_marks(int);
int find_triangle(int,int,int);

int main()
{
    int res1,res2,res3,res4,res6,res7;
    double res5;
    int age;
    printf("1. Enter the age : ");
    scanf("%d",&age);
    res1 = category_age(age);                //function call
    if(res1==1)
        printf("This is a child\n");
    else if(res1==2)
        printf("This is a Teenager\n");
    else if(res1==3)
        printf("This is an Adult\n");
    else
        printf("This is a Senior Citizen\n");
        
        int no;
    printf("\n 2.enter a number: ");
    scanf("%d",&no);
    res2 = divisibility(no);
    if(res2==1)
        printf("Divisible by both\n");
    else if(res2==2)
        printf("Divisible by 5 but not by 3\n");
    else if(res2==3)
        printf("Divisible by 3 but not by 5\n");
    else
        printf("Divisible by None\n");
        
        int no1,no2,no3;
     printf("\n 3.Enter a three number : ");
     scanf("%d%d%d",&no1, &no2,&no3);
     printf("a = %d, b = %d, c = %d\n", no1, no2, no3);
    res3 = greatest_no(no1,no2,no3);
    printf("Greatest number is %d\n",res3);
    
    int no4,no5;
    char op;
     printf("\n 4.enter a two operand : ");
     scanf("%d%d",&no4,&no5);
    printf("Enter operator (+,-,*,/,%%): ");
    scanf(" %c",&op);
    res4 = operation_on_operator(no4,no5,op);
    printf("Result of operation = %d\n",res4);

    double x;
    char is_student;
    printf("\n 5.Enter a price : ");
    scanf("%lf",&x);
    
    printf("student enter (y/n) : ");
    scanf(" %c",&is_student);
    res5 =find_price(x,is_student);
    printf("Final Price = %lf\n",res5);

      int mark;
      printf("\n 6.Enter a marks : " );
      scanf("%d",&mark);
    res6 = find_marks(mark);
    if(res6==1)
        printf("Distinction\n");
    else if(res6==2)
        printf("First Class\n");
    else if(res6==3)
        printf("Second Class\n");
    else if(res6==4)
        printf("Pass Class\n");
    else
        printf("Fail\n");

     int a,b,c;
     printf("\n7. Enter of a Three side of triangle : ");
     scanf("%d%d%d",&a,&b, &c);
    res7 = find_triangle(a,b,c);
    if(res7==1)
        printf("The triangle is Equilateral\n");
    else if(res7==2)
        printf("The triangle is Isosceles\n");
    else
        printf("The triangle is Scalene\n");

    return 0;
}
//Category of Age
int category_age(int age)                          //function defination
{
    if(age<12)
        return 1;
    else if(age>=12 && age<=19)
        return 2;
    else if(age>=20 && age<60)
        return 3;
    else
        return 4;
}
//Divisibility
int divisibility(int no)
{
    if(no%3==0 && no%5==0)
        return 1;
    else if(no%5==0)
        return 2;
    else if(no%3==0)
        return 3;
    else
        return 4;
}
//Greatest Number
int greatest_no(int a, int b, int c)
{
    if(a>b)
    {
        if(a>c)
            return a;
        else
            return c;
    }
    else
    {
        if(b>c)
            return b;
        else
            return c;
    }
}
//Operation
int operation_on_operator(int a, int b, char op)
{
	int c;
    if(op=='+')
        return a+b;
    else if(op=='-')
        return a-b;
    else if(op=='*')
       return a*b;
    else if(op=='/')
        return a/b;
    else if(op=='%')
        return a%b;
     else
	 {
     printf("Invalid operator\n");
       return 0;
	 }
    
}
//Price
double find_price(double price, char is_student)
{
    
    double discount=0.0,fprice;

    if(is_student=='y' || is_student=='y')
    {
        if(price>=500)
            discount=price*0.20;
        else
            discount=price*0.10;
    }
    else
    {
        if(price>=600)
            discount=price*0.15;
    }

    fprice=price-discount;

    return fprice;
}
//Marks
int find_marks(int mark)
{
    if(mark>=75)
        return 1;
    else if(mark>=65)
        return 2;
    else if(mark>=55)
        return 3;
    else if(mark>=40)
        return 4;
    else
        return 5;
}
//Triangle
int find_triangle(int a,int b, int c)
{
    if(a==b && b==c)
        return 1;
    else if(a==b || b==c || a==c)
        return 2;
    else
        return 3;
}