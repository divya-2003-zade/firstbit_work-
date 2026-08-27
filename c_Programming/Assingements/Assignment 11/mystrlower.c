#include<stdio.h>
#include<string.h>
char*mystrlower(char*str)
{
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]>='A'&&str[i]<='Z')
		{
			str[i]=str[i]+32;
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
	
	char*lwrlet=mystrlower(str);
	printf("The string in the LOWER-CASE :%s",lwrlet);
}