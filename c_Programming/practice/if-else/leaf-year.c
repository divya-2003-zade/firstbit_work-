#include<stdio.h>
void main()
{
	int yr;
	printf("Enter a Year : ");
	scanf("%d",&yr);
	
	if(yr % 4 == 0)
		printf("%d is leaf year ",yr);
	else
	 printf("%d is not a leaf year ",yr);
}