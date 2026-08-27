#include<stdio.h>
#include<string.h>
int mystrlen(char*str)
{
	int i=0;
	while(str[i]!='\0')
	{
		i++;
	}
	return i;
}
void main()
{
	char str[]="Hellofirstbit";
	
	int len=mystrlen(str);
	printf("Length=%d",len);
}