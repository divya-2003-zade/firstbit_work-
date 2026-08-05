#include<stdio.h>
struct Admin
{
	int id;
	char name[20];
	double salary;
	double allowance;
	
};
void main()
{
	struct Admin adm1,adm2;
	printf("Enter the Admin 1 Id , name and salary , allowance:");
	scanf("%d%s%lf%lf",&adm1.id,adm1.name,&adm1.salary,&adm1.allowance);
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf  \nAllowance :%.2lf",adm1.id,adm1.name,adm1.salary,adm1.allowance);
	
	printf("\n\nEnter the Admin 2 Id , name and salary , allowance:");
	scanf("%d%s%lf%lf",&adm2.id,adm2.name,&adm2.salary,&adm2.allowance);
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf  \nAllowance :%.2lf",adm2.id,adm2.name,adm2.salary,adm2.allowance);
	
}