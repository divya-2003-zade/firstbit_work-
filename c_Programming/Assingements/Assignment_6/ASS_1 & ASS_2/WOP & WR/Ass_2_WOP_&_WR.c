//Without Parameter and With Return Type
#include<stdio.h>
int category_age();
int divisibility();                       //function declaration
int greatest_no();
int operation_on_operator();
double price();
int marks();
int triangle();

int main()
{
    int res1,res2,res3,res4,res6,res7;
    double res5;
    res1 = category_age();                //function call
    if(res1==1)
        printf("This is a child\n");
    else if(res1==2)
        printf("This is a Teenager\n");
    else if(res1==3)
        printf("This is an Adult\n");
    else
        printf("This is a Senior Citizen\n");

    res2 = divisibility();
    if(res2==1)
        printf("Divisible by both\n");
    else if(res2==2)
        printf("Divisible by 5 but not by 3\n");
    else if(res2==3)
        printf("Divisible by 3 but not by 5\n");
    else
        printf("Divisible by None\n");

    res3 = greatest_no();
    printf("Greatest number is %d\n",res3);

    res4 = operation_on_operator();
    printf("Result of operation = %d\n",res4);

    res5 = price();
    printf("Final Price = %f\n",res5);

    res6 = marks();
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

    res7 = triangle();
    if(res7==1)
        printf("The triangle is Equilateral\n");
    else if(res7==2)
        printf("The triangle is Isosceles\n");
    else
        printf("The triangle is Scalene\n");

    return 0;
}
//Category of Age
int category_age()                          //function defination
{
    int age=25;

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
int divisibility()
{
    int no=25;

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
int greatest_no()
{
    int a=20,b=15,c=10;

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
int operation_on_operator()
{
    int a=9,b=3,c;
    char op='*';

    if(op=='+')
        c=a+b;
    else if(op=='-')
        c=a-b;
    else if(op=='*')
        c=a*b;
    else if(op=='/')
        c=a/b;
    else
        c=a%b;

    return c;
}
//Price
double price()
{
    double price=600;
    char is_student='n';
    double discount=0,fprice;

    if(is_student=='y')
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
int marks()
{
    int marks=35;

    if(marks>=75)
        return 1;
    else if(marks>=65)
        return 2;
    else if(marks>=55)
        return 3;
    else if(marks>=40)
        return 4;
    else
        return 5;
}
//Triangle
int triangle()
{
    int a=3,b=4,c=6;

    if(a==b && b==c)
        return 1;
    else if(a==b || b==c || a==c)
        return 2;
    else
        return 3;
}