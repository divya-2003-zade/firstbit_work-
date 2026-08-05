#include<stdio.h>

typedef struct student
{
    int roll_no;
    char name[20];
    int marks;
}student;

void store(student* s)
{
    printf("Enter Roll No, Name and Marks: ");
    scanf("%d", &s->roll_no);
    scanf("%s", s->name);
    scanf("%d", &s->marks);
}

void display(student* s)
{
    printf("\nRoll No : %d", s->roll_no);
    printf("\nStudent Name : %s", s->name);
    printf("\nMarks : %d\n\n", s->marks);
}

void main()
{
    struct student s1, s2;

    store(&s1);
    display(&s1);

    store(&s2);
    display(&s2);
}