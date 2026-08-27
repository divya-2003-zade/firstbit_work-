class palindrome
{
public static void main(String args[])
{
	int rev=0,org,rem;
	int no=121;
	org=no;
	while(no != 0)
	{
		rem = no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	if(rev==org)
	{
		System.out.printf(" palindrome ");
	}
	else
	{
		System.out.printf("Not palindrome");
	}
	
}
}