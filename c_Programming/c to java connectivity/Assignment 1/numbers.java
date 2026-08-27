class numbers
{
	public static void main(String args[])
{
	int no=121,rev=0;
	int frist, last;
	frist= no/100;
	last= no%10;
	if(frist==last)
	{
		System.out.printf("Given three digit number is pallindrome");
	}
	else
	{
		System.out.printf("Given three digit number  not is pallindrome");
	}
}
}