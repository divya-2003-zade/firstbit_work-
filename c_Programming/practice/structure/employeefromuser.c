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
int searchEmployeeById(Employee* ,int , int );
void storeEmployeesHardcoded(Employee*,int*);
void main()
{
	//int size;
	//printf("How many employees you want to store");
	//scanf("%d",&size);
	Employee emparr[100];
	int currentindex=0;
	////////////// Input from user /////////////////
	printf("How many employees you want to add:");
	scanf("%d",&currentindex);

	printf("\nEnter details of employees:");
	storeEmployees(emparr,currentindex);
	////////////// Input from user /////////////////
	
	//////////////// Hardcoded//////////////////////
	//storeEmployeesHardcoded(emparr,&currentindex);
	//////////////// Hardcoded//////////////////////
	
	
	printf("\nEmployees are:\n");
	displayEmployees(emparr,currentindex);
	
	int id;
	printf("Enter id you want search");
	scanf("%d",&id);
	int index=searchEmployeeById(emparr,currentindex,id);
	if(index!=-1)
	{
		printf("%s found at %d index",emparr[index].name,index);
	}
	else
	{
		printf("Not found");
	}
	

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
int searchEmployeeById(Employee* emparr,int size, int id)
{
	for(int i=0; i<size; i++)
	{
		if(emparr[i].id==id)
		return i;
	}
	return -1;
}
void storeEmployeesHardcoded(Employee* emparr,int* currentindex)
{
	emparr[*currentindex].id=101;
	strcpy(emparr[*currentindex].name,"divya");
	emparr[*currentindex].salary=50000;
	(*currentindex)++;
	
	emparr[*currentindex].id=102;
	strcpy(emparr[*currentindex].name,"pratu");
	emparr[*currentindex].salary=700000;
	(*currentindex)++;
	
	emparr[*currentindex].id=103;
	strcpy(emparr[*currentindex].name,"yash");
	emparr[*currentindex].salary=60000;
	(*currentindex)++;
	
	emparr[*currentindex].id=104;
	strcpy(emparr[*currentindex].name,"ram");
	emparr[*currentindex].salary=50500;
	(*currentindex)++;
	
	emparr[*currentindex].id=105;
	strcpy(emparr[*currentindex].name,"riya");
	emparr[*currentindex].salary=55000;
	(*currentindex)++;
}