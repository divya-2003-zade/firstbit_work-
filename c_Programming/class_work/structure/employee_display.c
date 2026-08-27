struct Employee
{
	int id;
	char name[20];
	double salary;
};
void main()
{
	struct Employee e1,e2,e3;
	printf("Enter a id,name and salary of employee 1:");
	scanf("%d",&e1.id);
	scanf("%s",&e1.name);
	scanf("%lf",&e1.salary);
	
	printf("Enter a id,name and salary of employee 2:");
	scanf("%d",&e2.id);
	scanf("%s",&e2.name);
	scanf("%lf",&e2.salary);
	
	printf("Enter a id,name and salary of employee 3:");
	scanf("%d",&e3.id);
	scanf("%s",&e3.name);
	scanf("%lf",&e3.salary);
	
	printf("\nEmployee 1:");
	printf("Id = %d Name =%s salary =%lf",e1.id,e1.name,e1.salary);
	
	printf("\nEmployee 2:");
	printf("Id = %d Name =%s salary =%lf",e2.id,e2.name,e2.salary);
	
	printf("\nEmployee 3:");
	printf("Id = %d Name =%s salary =%lf",e3.id,e3.name,e3.salary);
	
}