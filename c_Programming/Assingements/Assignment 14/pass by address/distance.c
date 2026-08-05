#include<stdio.h>

typedef struct Distance
{
    int feet;
    int inch;
}Distance;
void display(Distance*);
void store(Distance*);
void main()
{
    Distance d,td;
    
     store(&d);
     display(&d);
}
void store(Distance* dis)
{
	int totalInches;
	printf("Enter Total Inches: ");
    scanf("%d", &totalInches);
    dis->feet = totalInches / 12;
    dis->inch = totalInches % 12;
}
void display(Distance *dis)
{
	printf("\nDistance = %d feet %d inch", dis->feet, dis->inch);
}