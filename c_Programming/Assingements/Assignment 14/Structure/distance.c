#include<stdio.h>

struct Distance
{
    int feet;
    int inch;
};

void main()
{
    struct Distance d;
    int totalInches;

    printf("Enter Total Inches: ");
    scanf("%d", &totalInches);

    d.feet = totalInches / 12;
    d.inch = totalInches % 12;

    printf("\nDistance = %d feet %d inch", d.feet, d.inch);
}