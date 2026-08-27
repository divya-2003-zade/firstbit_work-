#include<stdio.h>
typedef struct Employee
{
	int id;
	char name[20];
	double salary;
}Employee;
void storeEmployees(Employee*,int);
void displayEmployees(Employee*,int);
int searchEmployeeById(Employee*,int , int);
void main()
{
	Employee emparr[10];
	
	printf("Enter details of employees");
	storeEmployees(emparr,10);
	
	printf("\nEmployees are:\n");
	displayEmployees(emparr,10);
	
	int id;
	printf("Enter id you want search");
	scanf("%d",&id);
	int index=searchEmployeeById(emparr,10,id);
	if(index!=-1)
	{
		printf("%s found at %d index",emparr[index].name,index);
	}
	else
	{
		printf("Not found");
	}
	
	
	
}//main ends here


void storeEmployees(  Employee*  emparr   ,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&emparr[i].id);
		scanf("%s",emparr[i].name);
		scanf("%lf",&emparr[i].salary);
	}
	
}//store employee ends here

void displayEmployees(Employee* emparr,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("%d  %s  %lf\n",emparr[i].id,emparr[i].name,emparr[i].salary);
	}
}
int searchEmployeeById(Employee* emparr,int size, int id)
{
	for(int i=0; i<size; i++)
	{
		if(emparr[i].id==id)
		return i;
		
	}
	return -1;
}