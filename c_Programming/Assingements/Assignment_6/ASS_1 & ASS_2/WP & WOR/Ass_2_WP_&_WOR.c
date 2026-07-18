//With Parameter and Without Return Type
#include<stdio.h>
void category_age(int);
void divisibility(int);                       //function declaration
void greatest_no(int,int, int);
void operation_on_operator(int, int,char);
void find_price(double,char);
void find_marks(int);
void find_triangle(int,int,int);

void main()
{
    int age;
    printf("1. Enter the age : ");
    scanf("%d",&age);
    category_age(age);                //function call
        
        int no;
    printf("\n 2.enter a number: ");
    scanf("%d",&no);
    divisibility(no);
    
        int no1,no2,no3;
     printf("\n 3.Enter a three number : ");
     scanf("%d%d%d",&no1, &no2,&no3);
     printf("a = %d, b = %d, c = %d\n", no1, no2, no3);
    greatest_no(no1,no2,no3);
    
    
    int no4,no5;
    char op;
     printf("\n 4.enter a two operand : ");
     scanf("%d%d",&no4,&no5);
    printf("Enter operator (+,-,*,/,%%): ");
    scanf(" %c",&op);
    operation_on_operator(no4,no5,op);
    

    double x;
    char is_student;
    printf("\n 5.Enter a price : ");
    scanf("%lf",&x);
    
    printf("student enter (y/n) : ");
    scanf(" %c",&is_student);
    find_price(x,is_student);
    

      int mark;
      printf("\n 6.Enter a marks : " );
      scanf("%d",&mark);
    find_marks(mark);
    
     int a,b,c;
     printf("\n7. Enter of a Three side of triangle : ");
     scanf("%d%d%d",&a,&b, &c);
     find_triangle(a,b,c);
}
//Category of Age
void category_age(int age)                          //function defination
{
    if(age<12)
        printf("This is a child\n");
    else if(age>=12 && age<=19)
        printf("This is a Teenager\n");
    else if(age>=20 && age<60)
        printf("This is an Adult\n");
    else
        printf("This is a Senior Citizen\n");
}
//Divisibility
void divisibility(int no)
{
    if(no%3==0 && no%5==0)
        printf("Divisible by both\n");
    else if(no%5==0)
        printf("Divisible by 5 but not by 3\n");
    else if(no%3==0)
        printf("Divisible by 3 but not by 5\n");
    else
         printf("Divisible by None\n");
}
//Greatest Number
void greatest_no(int a, int b, int c)
{
    if(a>b)
    {
        if(a>c)
            printf("The greates no. is a %d \n",a);
        else
            printf("The greates no. is c %d \n",c);
    }
    else
    {
        if(b>c)
            printf("The greates no. is b %d \n",b);
        else
            printf("The greates no. is c %d \n",c);
	}
            
}
//Operation
void operation_on_operator(int a, int b, char op)
{
	int c;
    if(op=='+')
        c= a+b;
    else if(op=='-')
        c= a-b;
    else if(op=='*')
       c= a*b;
    else if(op=='/')
        c=  a/b;
    else if(op=='%')
        c=  a%b;
     else
	 {
     printf("Invalid operator\n");
	 }
	 printf("Result of operation = %d\n",c);
    
}
//Price
void find_price(double price, char is_student)
{
    
    double discount=0.0,fprice;

    if(is_student=='y' || is_student=='Y')
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

    printf("Final Price = %lf\n",fprice);
}
//Marks
void find_marks(int mark)
{
    if(mark>=75)
        printf("Distinction\n");
    else if(mark>=65)
        printf("First Class\n");
    else if(mark>=55)
         printf("Second Class\n");
    else if(mark>=40)
        printf("Pass Class\n");
    else
        printf("Fail\n");
}
//Triangle
void find_triangle(int a,int b, int c)
{
    if(a==b && b==c)
        printf("The triangle is Equilateral\n");
    else if(a==b || b==c || a==c)
        printf("The triangle is Isosceles\n");
    else
        printf("The triangle is Scalene\n");
}