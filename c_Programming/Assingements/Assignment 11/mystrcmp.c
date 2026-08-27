#include<stdio.h>
#include<string.h>
int mystrcmp(char*str1,char*str2)
{
	int i=0;
	while(str1[i]!='\0' && str2[i]!='\0')
	{
		if(str1[i]!=str2[i])
		{
			return str1[i]-str2[i];
			
		}
		i++;
	}
	return str1[i]-str2[i];
}
void main()
{
	char str1[100];
	char str2[200];
	
	printf("Enter a first string :");
	scanf("%s",&str1);
	
	printf("Enter a second string :");
	scanf("%s",&str2);
	
	int str=mystrcmp(str2,str1);
	
	printf("%d\n",str);
	
	if(str==0)
	{
		printf("Both string are same ");
	}
	else if(str<0)
	{
		printf("The first string is smaller ");
	}
	else 
	 printf("The first string is grater");
}