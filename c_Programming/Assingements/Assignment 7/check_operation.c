#include<stdio.h>
void check_operation(int*,int*,char*);
void main()
{
	
    int a,b;
	char op;
	printf("Enter a two operand :");
	scanf("%d%d %c",&a,&b,&op);
	check_operation(&a,&b,&op);
}
void check_operation(int*a,int*b,char*op)
{
	if(*op=='+')
	printf("The addition of two no. is %d",(*a)+(*b));	
	else if( *op =='-')
	       printf("The substraction of two no. is %d",(*a)-(*b));	
	    else if(*op =='*')
	         printf("The multiplication of two no. is %d",(*a)*(*b));
	      else	if(*op =='/')
	          printf("The Division of two no. is %d",(*a)/(*b));
	        else if( *op=='%')
	               printf("The mode of two no. is %d",(*a)%(*b));
                   else
                       printf("Invalid operator");
}