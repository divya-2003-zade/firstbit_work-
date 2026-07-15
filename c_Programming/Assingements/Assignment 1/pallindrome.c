//Write a program to check given 3 digit number is pallindrome or not.
void main()
{
	int no=121,rev=0;
	int frist, last;
	frist= no/100;
	rev=rev*10+no;
	last= no%10;
	if(frist==last)
	{
		printf("Given three digit number is pallindrome");
	}
	else
	{
		printf("Given three digit number  not is pallindrome");
	}
}