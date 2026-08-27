class sum
{
public static void main(String args[])
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
	System.out.printf("%d (%d + %d) ", sum,f,l);
}
}