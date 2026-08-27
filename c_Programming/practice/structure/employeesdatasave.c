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
void storeEmployeesHardcoded(Employee*);
void main()
{
	int size;
	//printf("How many employees you want to store");
	//scanf("%d",&size);
	size=5;
	Employee emparr[size];

	//printf("\nEnter details of employees:");
	//storeEmployees(emparr,size);
	storeEmployeesHardcoded(emparr);
	
	printf("\nEmployees are:\n");
	displayEmployees(emparr,size);
	
	int id;
	printf("Enter id you want search");
	scanf("%d",&id);
	int index=searchEmployeeById(emparr,size,id);
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
void storeEmployeesHardcoded(Employee* emparr)
{
	emparr[0].id=101;
	strcpy(emparr[0].name,"divya");
	emparr[0].salary=50000;
	
	emparr[1].id=102;
	strcpy(emparr[1].name,"pratu");
	emparr[1].salary=700000;
	
	emparr[2].id=103;
	strcpy(emparr[2].name,"yash");
	emparr[2].salary=60000;
	
	emparr[3].id=104;
	strcpy(emparr[3].name,"ram");
	emparr[3].salary=50500;
	
	emparr[4].id=105;
	strcpy(emparr[4].name,"riya");
	emparr[4].salary=55000;
}