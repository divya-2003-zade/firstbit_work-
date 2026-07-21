#include<stdio.h>
void find_salary(int*);
void main()
{
	int basic;
	printf("Enter a basic of the salary:");
	scanf("%d",&basic);
	find_salary(&basic);
}
void find_salary(int*basic)
{
	int da,ta,hra,total;
	if(*basic<= 5000)
	{
		
        da=*basic * 10 /100;
		ta=*basic * 20 /100;
		hra= *basic *25/100;
	}
	else
	{
		da=*basic * 15 /100;
	    ta=*basic * 25 /100;
        hra= *basic *30/100;
	}
   total= *basic+da+ta+hra;
	
	printf("Basic Salary = %d\n", *basic);
    printf("DA = %d\n", da);
    printf("TA = %d\n", ta);
    printf("HRA = %d\n", hra);
    printf("total salary based on the basic is %d",total);
}