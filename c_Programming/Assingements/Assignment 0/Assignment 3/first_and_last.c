// sum of first and last digit
void main()
{
	int f,l;
	int no=12345;
	int sum;
	l=no%10;
	while(no>1)
	{
	  no=no/10;
	}
	f=no;
	sum=f+l;
	printf("%d (%d + %d) ", sum,f,l);
}