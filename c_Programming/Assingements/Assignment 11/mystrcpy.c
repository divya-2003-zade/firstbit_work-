#include<stdio.h>
#include<string.h>
char * mystrcpy(char*dest,char*sour)
{
	int i=0;
	while(sour[i]!='\0')
	{
		dest[i]=sour[i];
		i++;
	}
	dest[i]='\0';
	return dest;
}
void main()
{
	char sour[]="hello";
	char dest[]="firstbit";
	
	char *str=mystrcpy(dest,sour);
	
	printf("%s",str);
}