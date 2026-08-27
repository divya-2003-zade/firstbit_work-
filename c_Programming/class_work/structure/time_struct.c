#include<stdio.h>
struct Time
{
	int hr,min,sec;
};
struct Time format(struct Time);
void displayTime(struct Time);
void main()
{
	//int hr,min,sec;
	struct Time t,ft;
	printf("Enter an hr, min and sec :");
	scanf("%d%d%d",&t.hr,&t.min,&t.sec);
	
//	printf("%d-%d-%d",t.hr,t.min,t.sec);
	displayTime(t);
	ft=format(t);
	displayTime(ft);
}
void displayTime(struct Time t)
{
	printf("\n%d-%d-%d",t.hr,t.min,t.sec);
}
struct Time format(struct Time t)
{
	int tsec=t.hr*60*60+t.min*60+t.sec;
	printf("\n%d",tsec);
	t.hr=tsec/3600;
	t.min=tsec%3600;
	t.sec=t.min%60;
	t.min=t.min/60;
	
	return t;
}