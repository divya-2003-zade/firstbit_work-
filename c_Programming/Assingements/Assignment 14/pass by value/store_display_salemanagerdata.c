#include<stdio.h>
typedef struct SalesManager
{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
	
}SalesManager;
SalesManager storesalemanagerdata(SaleManager);
void display(SaleManager);
void main()
{
	struct SalesManager sm1,sm2;
	sm1=storesalemanagerdata(sm1);
	display(sm1);
	
	sm2=storesalemanagerdata(sm2);
	display(sm2);
	
	
}
SalesManager storesalemanagerdata(SalesManager salemang)
{
	printf("\nEnter the SalesManager 1 Id , name and salary , incentive & target:");
	scanf("%d%s%lf%lf%d",&salemang.id,salemang.name,&salemang.salary,&salemang.incentive,&salemang.target);
	return salemang;
}
void display(SalesManager salemang)
{
	printf("\nSalesManagerId :%d \nSalesManager name :%s \nsalary :%.2lf  \nincentive :%.2lf  \ntarget :%d",salemang.id,salemang.name,salemang.salary,salemang.incentive,salemang.target);
	
}