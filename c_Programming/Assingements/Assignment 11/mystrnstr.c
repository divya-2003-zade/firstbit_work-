#include<stdio.h>
char* mystrnstr(char *str, char *substr, int n)
{
    int i, j;

    for(i = 0; i < n && str[i] != '\0'; i++)
    {
        j = 0;

        while(substr[j] != '\0' &&
              i + j < n &&
              str[i + j] == substr[j])
        {
            j++;
        }

        if(substr[j] == '\0')
            return &str[i];
    }

    return NULL;
}
void main()
{
	char str[100];
	char substr[100];
	
	printf("Enter the string :");
	fgets(str, sizeof(str), stdin);

	
	printf("Enter the substring :");
	fgets(substr, sizeof(substr), stdin);
	
	char*result=mystrnstr(str,substr,6);
	if(result != NULL)
    {
        printf("String found: %s", result);
    }
    else
    {
        printf("String not found");
    }

	
}