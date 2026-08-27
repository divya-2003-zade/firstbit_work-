#include<stdio.h>
#include<string.h>
char*mystrstr(char*str,char*substr)
{
	int i,j;
	for(i=0; str[i]!='\0'; i++)
	{
		j=0;
		while(substr[j]!='\0'&& str[i+j]==substr[j])
		{
			j++;
		}
		if(substr[j]=='\0')
		{
			return &str[i];
		}
	}return NULL;
}
void main()
{
	char str[100];
	char substr[100];
	
	printf("Enter the string :");
	scanf("%s",str);
	
	printf("Enter the substring :");
	scanf("%s",substr);
	
	char*result=mystrstr(str,substr);
	if(result != NULL)
    {
        printf("String found: %s", result);
    }
    else
    {
        printf("String not found");
    }

	
}