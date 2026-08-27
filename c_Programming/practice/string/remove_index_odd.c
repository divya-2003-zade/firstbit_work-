#include<stdio.h>
void main()
{
	char str[100];
	
	printf("Enter a string: ");
	fgets(str,sizeof(str),stdin);
	for(int i=0; str[i]!=0; i++)
	{
		if(i%2!=0)
		 str[i]=NULL;
	}
	printf("New string are:%s",str);
}