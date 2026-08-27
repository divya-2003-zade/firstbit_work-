#include<stdio.h>
typedef struct Employee
{
	int id;
	char name[20];
	double salary;
}Employee;
Employee storeEmployee()
{
	 Employee emp;
	scanf("%d",&emp.id);
	scanf("%s",&emp.name);
	scanf("%lf",&emp.salary);
	return emp;
}
void display( Employee emp)
{
	printf("Id = %d Name =%s salary =%lf",emp.id,emp.name,emp.salary);
}
void main()
{
	 Employee e1,e2,e3;
	printf("Enter a id,name and salary of employee 1:");
	e1=storeEmployee();
	
	printf("Enter a id,name and salary of employee 2:");
	e2=storeEmployee();
	
	printf("Enter a id,name and salary of employee 3:");
	e3=storeEmployee();
	
	printf("\nEmployee 1:");
	display(e1);
	
	printf("\nEmployee 2:");
	display(e2);
	
	printf("\nEmployee 3:");
	display(e3);
}