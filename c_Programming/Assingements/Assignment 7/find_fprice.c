#include<stdio.h>
void find_fprice(double*,char*);
void main()
{
	
	double price;
	printf("Enter a price : ");
	scanf("%lf",&price);
	char is_student;
	printf("Enter a student(y/n) : ");
	scanf(" %c",&is_student);
	find_fprice(&price,&is_student);
}
void find_fprice(double*price,char*is_student)
{
	double fprice , discount=0;
	
	if(*is_student == 'y' || *is_student == 'Y')
	{
		if(*price>=500)
			discount=*price*0.20;
		else
			discount=*price*0.10;
	}
	else if(*price>=600)
			discount=*price*0.15;
	fprice=*price-discount;
	printf("final price in actual price %lf with discount %lf is %lf\n ",*price,discount,fprice);
	printf("Actual Price = %lf\n", *price);
    printf("Discount = %lf\n", discount);
    printf("Final Price = %lf", fprice);
}