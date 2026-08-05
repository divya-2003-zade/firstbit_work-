#include<stdio.h>
struct Admin
{
	int id;
	char name[20];
	double salary;
	double allowance;
	
};
struct Admin store(struct Admin);
void display(struct Admin);
void main()
{
	struct Admin adm1,adm2;
	
	adm1=store(adm1);
	display(adm1);
	
	adm2=store(adm2);
	display(adm2);

}
struct Admin store(struct Admin adm)
{
	printf("\nEnter the Admins  Id , name and salary , allowance:");
	scanf("%d%s%lf%lf",&adm.id,adm.name,&adm.salary,&adm.allowance);
	return adm;
}
void display(struct Admin adm)
{
	printf("\nEmployee Id :%d \nEmployee name :%s \nEmployee salary :%.2lf  \nAllowance :%.2lf",adm.id,adm.name,adm.salary,adm.allowance);
}