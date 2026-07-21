#include<stdio.h>
void find_percentage(int*,int*,int*,int*,int*);
void main()
{
	int eng,math,hindi,sci,mar;
	printf("Enter a subeject marks for to finding the percentage:");
	scanf("%d%d%d%d%d",&eng,&math,&hindi,&sci,&mar);
	find_percentage(&eng,&math,&hindi,&sci,&mar);
}
void find_percentage(int*eng,int*math,int*hindi,int*sci,int*mar)
{
	float sum=(*eng)+(*math)+(*hindi)+(*sci)+(*mar);
   float per=sum/500*100;
	printf("Total marks will be %f \n",sum);
	printf("Percentage will be %f",per);
}