#include<stdio.h>
struct Employee
{
	int id;
	char name[20];
	double salary;
};
void main()
{
	struct Employee emp1,emp2;
	printf("Enter the Employee 1 Id , name and salary :");
	scanf("%d%s%lf",&emp1.id,emp1.name,&emp1.salary);
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf",emp1.id,emp1.name,emp1.salary);
	
	printf("\n\nEnter the Employee 2 Id , name and salary :");
	scanf("%d%s%lf",&emp2.id,emp2.name,&emp2.salary);
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf",emp2.id,emp2.name,emp2.salary);
	
}