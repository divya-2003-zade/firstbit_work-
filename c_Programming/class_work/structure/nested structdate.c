#include<stdio.h>
typedef struct date
{
	int day;
	int month;
	int year;
}date;
typedef struct student
{
	int roll_no;
	char name[20];
	int marks;
	date dob;
}student;
void storestudent(student s)
{
	printf("Enter a Roll number :");
	scanf("%d",&s.roll_no);
	
	printf("Enter Name :");
	scanf("%s",s.name);
	
	printf("Enter a marks :");
	scanf("%d",&s.marks);
	
	printf("Enter a date of birth(dd mm yyyy) :");
	scanf("%d",&s.dob.day,&s.dob.month,&s.dob.year);
	
}
void displaystudent(student s)
{
	printf("Student details :");
	printf("Roll number :%d",s.roll_no);
	printf("name:%s",s.name);
	printf("marks:%d",s.marks);
	printf("Date of birth :%d%d%d",s.dob.day,s.dob.month,s.dob.year);
	
}
void main()
{
	student s;
	storestudent(s);
	displaystudent(s);
}