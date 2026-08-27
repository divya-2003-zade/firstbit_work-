#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="firstbit";
	char*ptr=strdup(str);
	printf("str = %s %u \n",str,str);
	printf("ptr = %s %u \n",ptr,ptr);
	ptr[3]='x';
	printf("str = %s %u \n",str,str);
	printf("ptr = %s %u \n",ptr,ptr);
}