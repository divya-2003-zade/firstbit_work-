#include<stdio.h>
#include<string.h>
char* mystrcat(char*src,char*dest)
{
	int i=0;
	int j=0;
	while(dest[i]!='\0')
	{
	    
		i++;
		
	}
	while(src[j]!='\0')
	{
		dest[i]=src[j];
		i++;
		j++;
	}
	dest[i]='\0';
	return dest;
}
void main()
{
	char src[100];
	char dest[120];
	
	printf("Enter a first string :");
	scanf("%s",&src);
	
	printf("Enter a second string :");
	scanf("%s",&dest);
	
	char* concat= mystrcat(dest,src);
	printf("The concatination string is :%s",concat);
	
	
	
}