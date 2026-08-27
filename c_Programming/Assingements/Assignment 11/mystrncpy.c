#include<stdio.h>
#include<string.h>
char * mystrncpy(char*dest,char*sour,int n)
{
	int i=0;
	for( i=0; i<n && sour[i]!='\0'; i++)
	{
		dest[i]=sour[i];
		
	}
	while(i<n)
	{
		dest[i]='\0';
		i++;
	}
	
	return dest;
}
void main()
{
	char sour[30];
	char dest[40];
	
	printf("Enter a first string :");
	scanf("%s",sour);
	
	printf("Enter a second string :");
	scanf("%s",dest);
	
	char *str=mystrncpy(dest,sour,5);
	printf("%s",str);
}