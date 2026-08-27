#include<stdio.h>
#include<string.h>
int mystrcasecmp(char*str1,char*str2)
{
	int i=0;
	while(str1[i]!='\0' && str2[i]!='\0')
	{
		char ch1 = str1[i];
        char ch2 = str2[i];

        // Convert uppercase to lowercase
        if(ch1 >= 'A' && ch1 <= 'Z')
        {
            ch1 = ch1 + 32;
        }

        if(ch2 >= 'A' && ch2 <= 'Z')
        {
            ch2 = ch2 + 32;
        }

        if(ch1 != ch2)
        {
            return ch1 - ch2;
        }

		i++;
	}
	return str1[i]-str2[i];
}
void main()
{
	char str1[50];
	char str2[60];
	
	printf("Enter a first string:");
	scanf("%s",str1);
	
	printf("Enter a second string:");
	scanf("%s",str2);
	
	int result=mystrcasecmp(str1,str2);
	printf("Result = %d\n",result);
	
	if(result==0)
	{
		printf("Both string are same ");
	}
	else if(result<0)
	{
		printf("The first string is smaller ");
	}
	else 
	 printf("The first string is grater");
}