#include<stdio.h>
typedef struct HR
{
	int id;
	char name[20];
	double salary;
	double commission;
	
}HR;
HR storehrdata(HR );
void display(HR );
void main()
{
	 HR hr1,hr2;
	
	hr1=storehrdata(hr1);
	display(hr1);
	
	hr2=storehrdata(hr2);
	display(hr2);
}
HR storehrdata(HR hr)
{
	printf("\nEnter the HR details  Id , name and salary , commission:");
	scanf("%d%s%lf%lf",&hr.id,hr.name,&hr.salary,&hr.commission);
	return hr;
}
void display(HR hr)
{
	printf("\nHR Id :%d \nHR name :%s \nHR salary :%.2lf  \ncommission :%.2lf",hr.id,hr.name,hr.salary,hr.commission);
}
