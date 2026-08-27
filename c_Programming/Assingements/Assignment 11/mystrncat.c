#include<stdio.h>
char* mystrncat(char *dest, char *src, int n)
{
    int i = 0;
    int j = 0;

    while(dest[i] != '\0')
    {
        i++;
    }

    while(j < n && src[j] != '\0')
    {
        dest[i] = src[j];
        i++;
        j++;
    }

    dest[i] = '\0';

    return dest;
}
void main()
{
	char src[100];
	char dest[120];
	
	printf("Enter a first string :");
	scanf("%s",src);
	
	printf("Enter a second string :");
	scanf("%s",dest);
	
	char* concat= mystrncat(dest,src,5);
	printf("The concatination string is :%s",concat);
	
	
	
}