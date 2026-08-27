#include<stdio.h>
void main()
{
	char name[10];
	
	printf("Enter a name:");
	scanf("%s",name);
	
	printf("\n Name is :%s",name);
	
	int i=0;
	while(name[i]!='\0')
	{
		i++;
	}
	printf("\nLenth of string is %d",i);
}