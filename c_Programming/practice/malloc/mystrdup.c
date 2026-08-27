#include<stdio.h>
#include<string.h>
#include<stdlib.h>
mystrdup(char*);
void main()
{
	char str[]="firstbit";
	
	char*ptr=mystrdup(str);
	
	printf("str =%s %u \n",str,str);
	printf("ptr =%s %u \n",ptr,ptr);
	
	ptr[3]='x';
	
	printf("str =%s %u \n",str,str);
	printf("ptr =%s %u \n",ptr,ptr);
}
mystrdup(char*str)
{
	int size=strlen(str)+1;
	//char dup[size];
	
	char*dup = malloc(sizeof(char)*size);
	
	for(int i=0; i<size; i++)
	dup[i]=str[i];
	
	return dup;
}