#include<stdio.h>
typedef struct Employee
{
	int id;
	char name[20];
	double salary;
}
Employee;
void storeEmployees(Employee* , int);
void displayEmployees(Employee* ,int);
void main()
{
	Employee arr1[7],arr2[6],arr3[5];
	
	printf("\nEnter details of employsss 1:");
	storeEmployees(arr1,7);
	
	printf("\nEnter details of employsss 2:");
	storeEmployees(arr2,6);
	
	printf("\nEnter details of employsss 3:");
	storeEmployees(arr3,5);
	
	printf("\nEmployees 1 are:\n");
	displayEmployees(arr1,7);
	
	printf("\nEmployees 2 are:\n");
	displayEmployees(arr2,6);
	
	printf("\nEmployees 3 are:\n");
	displayEmployees(arr3,5);
}
void storeEmployees(Employee* emparr,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&emparr[i].id);
		scanf("%s",emparr[i].name);
		scanf("%lf",&emparr[i].salary);
	}
}
void displayEmployees(Employee* emparr,int size)
{
	for(int i=0; i<size; i++)
	 {
	  printf("%d %s %lf \n",emparr[i].id,emparr[i].name,emparr[i].salary);
     }
}