#include<stdio.h>
typedef struct SalesManager
{
	int id;
	char name[20];
	double salary;
	double incentive;
	int target;
	
}SalesManager;
void storesalemanagerdata(SalesManager*);
void display(SalesManager*);
void main()
{
	SalesManager sm1,sm2;
	storesalemanagerdata(&sm1);
	display(&sm1);
	
	storesalemanagerdata(&sm2);
	display(&sm2);
	
}
void storesalemanagerdata(SalesManager* salemang)
{
	printf("\nEnter the SalesManager 1 Id , name and salary , incentive & target:");
	scanf("%d%s%lf%lf%d",&salemang->id,salemang->name,&salemang->salary,&salemang->incentive,&salemang->target);
}
void display(SalesManager* salemang)
{
	printf("\nSalesManagerId :%d \nSalesManager name :%s \nsalary :%.2lf  \nincentive :%.2lf  \ntarget :%d",salemang->id,salemang->name,salemang->salary,salemang->incentive,salemang->target);
	
}