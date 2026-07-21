#include<stdio.h>
void find_divisibility(int*);
void main()
{
	
	int no;
	printf("Enter a number :");
	scanf("%d",&no);
	find_divisibility(&no);
}
void find_divisibility(int*no)
{
	if(*no%3==0 && *no%5==0)
     printf("%d is Divisible by both",*no);
	else if(*no%5==0)
	     printf("%d is Divisible by 5 but not by 3",*no);
		else if(*no%3==0)
			printf("%d is Divisible by 3 but not by 5",*no);
			else
				printf("%d is Divisible by None",*no);
}
