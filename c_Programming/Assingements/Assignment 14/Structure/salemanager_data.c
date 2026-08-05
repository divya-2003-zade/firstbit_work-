#include<stdio.h>
struct SalesManager
{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
	
};
void main()
{
	struct SalesManager sm1,sm2;
	printf("Enter the SalesManager 1 Id , name and salary , incentive & target:");
	scanf("%d%s%lf%lf%d",&sm1.id,sm1.name,&sm1.salary,&sm1.incentive,&sm1.target);
	printf("\nSalesManagerId :%d \nSalesManager name :%s \nsalary :%.2lf  \nincentive :%.2lf  \ntarget :%d",sm1.id,sm1.name,sm1.salary,sm1.incentive,sm1.target);
	
	printf("\n\nEnter the SalesManager 2 Id , name and salary , incentive & target:");
	scanf("%d%s%lf%lf%d",&sm2.id,sm2.name,&sm2.salary,&sm2.incentive,&sm2.target);
	printf("\nSalesManager Id :%d \nSalesManager name :%s \nsalary :%.2lf  \nincentive :%.2lf  \ntarget :%d",sm2.id,sm2.name,sm2.salary,sm2.incentive,sm2.target);
	
}