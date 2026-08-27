struct Employee
{
	int id;
	char name[20];
	double salary;
};
struct Employee storeEmployee()
{
	struct Employee emp;
	scanf("%d",&emp.id);
	scanf("%s",&emp.name);
	scanf("%lf",&emp.salary);
	return emp;
}
void main()
{
	struct Employee e1,e2,e3;
	printf("Enter a id,name and salary of employee 1:");
	e1=storeEmployee();
	
	printf("Enter a id,name and salary of employee 2:");
	e2=storeEmployee();
	
	printf("Enter a id,name and salary of employee 3:");
	e3=storeEmployee();
	
	printf("\nEmployee 1:");
	printf("Id = %d Name =%s salary =%lf",e1.id,e1.name,e1.salary);
	
	printf("\nEmployee 2:");
	printf("Id = %d Name =%s salary =%lf",e2.id,e2.name,e2.salary);
	
	printf("\nEmployee 3:");
	printf("Id = %d Name =%s salary =%lf",e3.id,e3.name,e3.salary);
	
}