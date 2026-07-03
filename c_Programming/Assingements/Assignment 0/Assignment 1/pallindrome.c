void main()
{
	int no=123;
	int frist, last;
	frist= no/100;
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