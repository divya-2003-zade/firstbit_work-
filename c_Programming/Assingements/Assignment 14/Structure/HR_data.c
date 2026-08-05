#include<stdio.h>
struct HR
{
	int id;
	char name[20];
	double salary;
	double commission;
	
};
void main()
{
	struct HR hr1,hr2;
	printf("Enter the Admin 1 Id , name and salary , commission:");
	scanf("%d%s%lf%lf",&hr1.id,hr1.name,&hr1.salary,&hr1.commission);
	printf("\nHR Id :%d \nHR name :%s \nHR salary :%.2lf  \ncommission :%.2lf",hr1.id,hr1.name,hr1.salary,hr1.commission);
	
	printf("\n\nEnter the HR 2 Id , name and salary , commission:");
	scanf("%d%s%lf%lf",&hr2.id,hr2.name,&hr2.salary,&hr2.commission);
	printf("\nHR Id :%d \nHR name :%s \nHR salary :%.2lf  \ncommission :%.2lf",hr2.id,hr2.name,hr2.salary,hr2.commission);
	
}