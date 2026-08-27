#include<stdio.h>
typedef struct Time 
{
	int hr;
	int sec;
	int min;
}Time;
void acceptTime(Time *t)
{
	printf("\nEnter Hours : ");
	scanf("%d",&t->hr);
	
	printf("\nEnter minutes: ");
    scanf("%d", &t->min);

    printf("\nEnter seconds: ");
    scanf("%d", &t->sec);
}
void displayTime(Time t)
{
	printf("%d hr",t.hr);
	printf("%d min", t.min);
	printf("%d sec", t.sec);
}
Time addTime(Time t1,Time t2)
{
	Time t3;
	t3.hr=t1.hr+t2.hr;
	t3.min=t1.min+t2.min;
	t3.sec=t1.sec+t2.sec;
	
	if (t3.sec >= 60) // sec to minute
    {
        t3.min = t3.min + t3.sec / 60;
        t3.sec = t3.sec % 60;
    }

    //  minutes to hours
    if (t3.min >= 60)
    {
        t3.hr = t3.hr + t3.min / 60;
        t3.min = t3.min % 60;
    }

    return t3;
}
int convertTosec(Time t)
{
	return (t.hr*3600)+(t.min*60)+t.sec;
}
int main()
{
	Time t1,t2,result;
	
	printf("Enter a first time :");
	acceptTime(&t1);
	
	printf("\nEnter a second time :");
	acceptTime(&t2);
	
	printf("\nfirst time:");
	displayTime(t1);
	
	printf("\nsecond time:");
	displayTime(t2);
	
	Time t3=addTime(t1,t2);
	
	printf("\nAddition of two time: ");
	displayTime(t3);
	
	printf("\nFirst time in second:%d ",convertTosec(t1));
	printf("\nSecond time in second :%d",convertTosec(t2));
	printf("\nAddtion of time in second:%d ",convertTosec(t3));
	
}