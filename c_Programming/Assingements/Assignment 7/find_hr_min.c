#include<stdio.h>
void find_hr_min(int*);
void main()
{
	int min;
	printf("Enter a minute : ");
	scanf("%d",&min);
	find_hr_min(&min);
	
}
void find_hr_min(int*min)
{ 
   int	Hr = *min / 60;
   int	rea_min = *min % 60;
	printf("%d minutes means %d hours \n",*min,Hr);
	printf("Remaining minutes in the %d minutes is %d minutes \n",*min,rea_min);
	printf("Total time will be %d minute = %d hours and %d remaining minutes \n",*min,Hr,rea_min);
}
