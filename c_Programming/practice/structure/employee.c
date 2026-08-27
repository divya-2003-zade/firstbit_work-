#include<stdio.h>
typedef struct Employee
{
	int id;
	char name[20];
	double salary;
}
Employee;
void main()
{
	Employee arr1[7],arr2[6],arr3[5];
	printf("\nEnter details of employsss 1:");
	for(int i=0;i<7;i++)
	{
		scanf("%d",&arr1[i].id);
		scanf("%s",arr1[i].name);
		scanf("%lf",&arr1[i].salary);
	}
	printf("\nEnter details of employsss 2:");
	for(int i=0;i<6;i++)
	{
		scanf("%d",&arr2[i].id);
		scanf("%s",arr2[i].name);
		scanf("%lf",&arr2[i].salary);
	}
	printf("\nEnter details of employsss 3:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr3[i].id);
		scanf("%s",arr3[i].name);
		scanf("%lf",&arr3[i].salary);
	}
	printf("\nEmployees 1 are:\n");
	for(int i=0; i<7; i++)
	 {
	  printf("%d %s %lf \n",arr1[i].id,arr1[i].name,arr1[i].salary);
     }
	printf("\nEmployees 2 are:\n");
	for(int i=0; i<6; i++)
	 {
	   printf("%d %s %lf \n",arr2[i].id,arr2[i].name,arr2[i].salary);
     }
	printf("\nEmployees 3 are:\n");
	for(int i=0; i<5; i++)
    {
	   printf("%d %s %lf \n",arr3[i].id,arr3[i].name,arr3[i].salary);
    }
	
}