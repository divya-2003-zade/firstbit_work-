#include<stdio.h>
#include<string.h>
char*mystrrev(char*str)
{
	int i=0;
	int j=0;
	char temp;
	//find length
	while(str[j]!='\0')
	{
		j++;
	}
     j--;  //move the last character
     
     while(i<j)
     {
     	temp=str[i];
     	str[i]=str[j];
     	str[j]=temp;
     	i++;
     	j--;
	 }
	
	return str;
}
void main()
{
	char str[30];
	
	printf("The string are : ");
	scanf("%s",str);
	
	char*rev=mystrrev(str);
	printf("The Reverse string are :%s",rev);
}