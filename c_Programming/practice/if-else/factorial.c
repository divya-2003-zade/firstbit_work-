#include<stdio.h>
void main()
{
	int no;
	int fact=1;
	printf("Enter a number : ");
	scanf("%d",&no);
	
	for(int i=1; i<=no; i++)
	{
		
		fact=fact*i;
		printf("\n%d factorial is %d ",i,fact);
	}
}