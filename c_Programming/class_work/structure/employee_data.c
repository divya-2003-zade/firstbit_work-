struct Employee
{
	int id;
	char name[20];
	double salary;
};
void main()
{
	int a;
	a=10;
	printf("%d\n",a);
	struct Employee e1,e2;
	
	e1.id=101;
	strcpy(e1.name,"divya");
	e1.salary=50000;
	printf("Id=%d ",e1.id);
	printf("\nEmployee name =%s ",e1.name);
	printf("\nEmployee salary=%lf ",e1.salary);
	
	printf("\nEnter a employee id, name & salary :");
	scanf("%d%s%.2lf",&e2.id,&e2.name,&e2.salary);
	printf("\nd=%d ",e2.id);
	printf("\nEmployee name =%s ",e2.name);
	printf("\nEmployee salary=%lf ",e2.salary);
	
	
}