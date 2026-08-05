#include<stdio.h>

struct Date
{
    int day;
    int month;
    int year;
};

void main()
{
    struct Date d1, d2;

    printf("Enter Date 1 (day month year): ");
    scanf("%d%d%d", &d1.day, &d1.month, &d1.year);

    printf("\nDate 1 : %d/%d/%d", d1.day, d1.month, d1.year);

    printf("\n\nEnter Date 2 (day month year): ");
    scanf("%d%d%d", &d2.day, &d2.month, &d2.year);

    printf("\nDate 2 : %d/%d/%d", d2.day, d2.month, d2.year);
}