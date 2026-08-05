#include<stdio.h>
typedef struct HR
{
	int id;
	char name[20];
	double salary;
	double commission;
	
}HR;
void storehrdata(HR* );
void display(HR* );
void main()
{
	 HR hr1,hr2;
	
	storehrdata(&hr1);
	display(&hr1);
	
	storehrdata(&hr2);
	display(&hr2);
}
void storehrdata(HR* hr)
{
	printf("\nEnter the HR details  Id , name and salary , commission:");
	scanf("%d%s%lf%lf",&hr->id,hr->name,&hr->salary,&hr->commission);
}
void display(HR* hr)
{
	printf("\nHR Id :%d \nHR name :%s \nHR salary :%.2lf  \ncommission :%.2lf",hr->id,hr->name,hr->salary,hr->commission);
}
