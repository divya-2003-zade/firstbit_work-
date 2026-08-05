#include<stdio.h>
typedef struct Employee
{
	int id;
	char name[20];
	double salary;
}Employee;
void storeEmployeedata(Employee*);
void display(Employee*);
void main()
{
	 Employee emp1,emp2;
	
	storeEmployeedata(&emp1);
	display(&emp1);
	
	storeEmployeedata(&emp2);
	display(&emp2);
	
}
void storeEmployeedata(Employee* emp)
{
	printf("\n\nEnter the Employee Data Id , name and salary :");
	scanf("%d%s%lf",&emp->id,emp->name,&emp->salary);
	
}
void display(Employee*emp)
{
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf",emp->id,emp->name,emp->salary);
}