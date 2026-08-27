struct student
{
	int roll_no;
	char name[20];
	int marks;
};
int main()
{
	struct student s1,s2;
	s1.roll_no=101;
	strcpy(s1.name,"divya");
	s1.marks=98;
	printf("\nstudent Roll No=%d",s1.roll_no);
	printf("\nstudent Name=%s",s1.name);
	printf("\nstudent marks=%d",s1.marks);
	
	printf("\n\nData of second student ");
	scanf("%d%s%d",&s2.roll_no,&s2.name,&s2.marks);
	printf("\nstudent Roll No=%d",s2.roll_no);
	printf("\nstudent Name=%s",s2.name);
	printf("\nstudent marks=%d",s2.marks);
	
}