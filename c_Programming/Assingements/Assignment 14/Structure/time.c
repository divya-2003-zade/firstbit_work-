#include<stdio.h>

struct Time
{
    int hour;
    int min;
    int sec;
};

void main()
{
    struct Time t1, t2;
    int totalSec1, totalSec2;

    printf("Enter Time 1 (hour min sec): ");
    scanf("%d%d%d", &t1.hour, &t1.min, &t1.sec);

    totalSec1 = (t1.hour * 3600) + (t1.min * 60) + t1.sec;

    printf("\nTime 1 : %d:%d:%d", t1.hour, t1.min, t1.sec);
    printf("\nTotal Seconds = %d", totalSec1);

    printf("\n\nEnter Time 2 (hour min sec): ");
    scanf("%d%d%d", &t2.hour, &t2.min, &t2.sec);

    totalSec2 = (t2.hour * 3600) + (t2.min * 60) + t2.sec;

    printf("\nTime 2 : %d:%d:%d", t2.hour, t2.min, t2.sec);
    printf("\nTotal Seconds = %d", totalSec2);
}