#include<stdio.h>
struct student
{
	int roll_no;
	char name[20];
	int marks;
};
void main()
{
	struct student s1,s2;
	printf("Enter a student 1 roll no , name and marks :");
	scanf("%d",&s1.roll_no);
	scanf("%s",s1.name);
	scanf("%d",&s1.marks);
	printf("\nRoll_No :%d  \nStudent Name :%s \nMarks :%d",s1.roll_no,s1.name,s1.marks );
	
	printf("\n\nEnter a student 2 roll no , name and marks :");
	scanf("%d",&s2.roll_no);
	scanf("%s",s2.name);
	scanf("%d",&s2.marks);
	printf("\nRoll_No :%d \nStudent Name :%s \nMarks :%d",s2.roll_no,s2.name,s2.marks );
}