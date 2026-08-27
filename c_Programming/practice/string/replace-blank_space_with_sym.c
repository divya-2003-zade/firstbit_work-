#include<stdio.h>
void main()
{
	char str[50];
	printf("Enter a string: ");
	fgets(str,sizeof(str),stdin);
	for(int i=0; str[i]!='\0'; i++)
	{
		if(str[i]==' ')
		 str[i]='$';
	}
	 printf("New string is :%s",str);
}