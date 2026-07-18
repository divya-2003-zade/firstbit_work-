//without parameter and without return type
#include<stdio.h>
void category_age();
void divisibility();
void greatest_no();
void operation_on_operator();                //function declaration
void price();
void marks();
void triangle();
void main()
{
	category_age();
	divisibility();
	greatest_no();
	operation_on_operator();                   //function call
	price();
	marks();
	triangle();
}
// category of age
void category_age()                           //function defination
{
	int age =25;
	if(age < 12)
	{
		printf("This is a child \n");
	}
	else 
	{
		if( age >= 12 && age <= 19)
		{
		printf("This is a Teenager \n");
		}
		else
	     {
		  if(age >= 20 && age < 60) 
		 {
		 printf("This a Adult age \n");
	     }
	        else
	         {
	    	   if(age>=60)
	    	    {
	    		   printf("This is a seinor citizen \n");
			    }
			}
		}
	}
}
// divisibility
void divisibility()
{
	int no=25;
	if(no%3==0 && no%5==0)
	{
     printf("Divisible by both \n");
	}
	else
	{
		if(no%5==0)
		{
	     printf("Divisible by 5 but not by 3 \n");
		}
		else
		{
			if(no%3==0)
			{
			printf("Divisible by 3 but not by 5 \n");
			}
			else
			{
				printf("Divisible by None \n");
			}
		}
	}
}
//Greatest number
void greatest_no()
{
	int a=20,b=15,c=10;
	if (a>b)
	{
		if (a>c)
		{
			printf("The greates no. is a %d \n",a);
		}
		else
		{
			printf("The greates no. is c %d \n",c);
		}
	}
	else
	{
		if (b>c)
		{
			printf("The greates no. is b %d \n",b);
		}
		else
		{
			printf("The greates no. is c %d \n",c);
		}
	}
}
//operation on operator
void operation_on_operator()
{
	int a=9, b=3,c;
	char op='*';
	if(op=='+')
	{
	c=a+b;
	printf("The addition of two no. is %d \n",c);	
	}
	else
	{
		if( op =='-')
		{
	       c=a-b;
	       printf("The substraction of two no. is %d \n",c);	
	    }
	    else
		{
			if(op =='*')
		  {
	         c=a*b;
	         printf("The multiplication of two no. is %d \n",c);	
	      }
	      else
	      {
	      	if(op =='/')
		    {
	          c=a/b;
	          printf("The Division of two no. is %d \n",c);	
	        }
	        else
	        {
	        	if( op=='%')
		         {
	               c=a%b;
	               printf("The mode of two no. is %d \n",c);	
	             }
			}
		  }
		}
   }
}
//price
void price()
{
	double price=600;
	char is_student='n';
	double fprice , discount;
	
	if(is_student == 'y')
	{
		if(price>=500)
		{
			discount=price*0.20;
		}
		else
		{
			discount=price*0.10;    
		}
	}
	else
	{
		if(price>=600)
		{
			discount=price*0.15;
		}
	}
	fprice=price-discount;
	printf("final price in actual price %lf with discount %lf is %lf \n",price,discount,fprice);
}
// find the marks
void marks()
{
	int marks = 35;
	if(marks>=75)
	{
		printf("Distinction \n");
	}
	else
	{
		if(marks>=65)
		{
			printf("First class \n");
		}
		else
		{
			if(marks>=55)
			{
				printf("second class \n");
			}
			else
			{
				if(marks>=40)
				{
					printf("pass class \n");
				}
				else
				{
					if(marks<=40)
					{
						printf("fail \n");
					}
				}
			}
		}
	}
	
}
//find the triangle
void triangle()
{
	int a=3,b=4,c=6;
	if(a==b &&  b==c)
	{
		printf("The triangle is equliteral \n");// all sides are equal 
	}
	else
	{
		if(a == b || b == c || a == c)
		{
			printf("The triangle is isosceles \n");// two side are equal
		}
		else
		{
			if(a != b || a != c || b != c)
			{
				printf("The triangle is scalene \n");// all side are diff
			}
		
		}
	}
}