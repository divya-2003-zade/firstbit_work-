#include<stdio.h>
typedef struct Admin
{
	int id;
	char name[20];
	double salary;
	double allowance;
	
}Admin;
void store( Admin*);
void display(Admin*);
void main()
{
	struct Admin adm1,adm2;
	
	store(&adm1);
	display(&adm1);
	
	store(&adm2);
	display(&adm2);

}
void store(Admin* adm)
{
	printf("\nEnter the Admins  Id , name and salary , allowance:");
	scanf("%d%s%lf%lf",&adm->id,adm->name,&adm->salary,&adm->allowance);
}
void display(Admin* adm)
{
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf  \nAllowance :%.2lf",adm->id,adm->name,adm->salary,adm->allowance);
}