#include<stdio.h>

typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;
Time storetime(Time);
void display(Time);
void main()
{
    struct Time t1, t2;
    t1=storetime(t1);
    display(t1);
    
    t2=storetime(t2);
    display(t2);
}
Time storetime(Time time)
{
	printf("Enter Time  (hour min sec): ");
    scanf("%d%d%d", &time.hour, &time.min, &time.sec);
    return time;
}
void display(Time time)
{
	int totalSec;
	totalSec = (time.hour * 3600) + (time.min * 60) + time.sec;

    printf("\nTime 1 : %d:%d:%d", time.hour, time.min, time.sec);
    printf("\nTotal Seconds = %d", totalSec);

}