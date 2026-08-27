struct Employee
{
	int id;
	char name[20];
	double salary;
	long mobile_no;
};
void main()
{
	int a;
	printf("size of int %d \n",sizeof(a));
	struct Employee e1;
	printf("size of Employee %d ",sizeof(e1));
	
}