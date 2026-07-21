#include<stdio.h>
void is_palindrome(int*);
void main()
{
	
	int no,rev=0;
	printf("Enter a three digit number :");
	scanf("%d",&no);
	is_palindrome(&no);
}
void is_palindrome(int*no)
{
	int frist, last;
	frist= (*no)/100;
	//int rev=rev*10+(*no);
	last= *no%10;
	if(frist==last)
		printf("%d number is pallindrome",*no);
	else
		printf("%d number  not is pallindrome",*no);
}