//Check the given number is Palindrome number or not.
//Input: n = 121
//palindrome number
void main()
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
		printf(" palindrome ");
	}
	else
	{
		printf("Not palindrome");
	}
	
}