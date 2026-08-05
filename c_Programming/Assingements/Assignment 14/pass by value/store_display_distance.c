#include<stdio.h>

struct Distance
{
    int feet;
    int inch;
};
void display(struct Distance);
struct Distance store(struct Distance);
void main()
{
    struct Distance d,td;
    
     d=store(d);
     display(d);
}
struct Distance store(struct Distance dis)
{
	int totalInches;
	printf("Enter Total Inches: ");
    scanf("%d", &totalInches);
    dis.feet = totalInches / 12;
    dis.inch = totalInches % 12;
    return dis;
}
void display(struct Distance dis)
{
	printf("\nDistance = %d feet %d inch", dis.feet, dis.inch);
}