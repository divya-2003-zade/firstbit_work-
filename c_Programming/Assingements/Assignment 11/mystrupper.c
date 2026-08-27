#include<stdio.h>
#include<string.h>
char*mystrupper(char*str)
{
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]>='a'&&str[i]<='z')
		{
			str[i]=str[i]-32;
		}
		i++;
	}
	return str;
}
void main()
{
	char str[20];
	
	printf("Enter a string :");
	scanf("%s",str);
	
	char*uplet=mystrupper(str);
	printf("The string in the UPPER-CASE :%s",uplet);
}