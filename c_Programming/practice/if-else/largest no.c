#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter a Three number: ");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>b)
	{
		if(a>c)
		 printf("%d is greater ",a);
		 else
		  printf("%d is grater ",c);
	}
	else 
	{ 
	    if(b>c)
	    printf("%d is greater ",b);
	     else
	       printf("%d is greater ",c);
	}
}