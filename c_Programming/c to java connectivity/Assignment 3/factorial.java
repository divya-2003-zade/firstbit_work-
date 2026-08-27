class factorial
{
public static void main(String args[])
{
	int i=1,fact=1,n=5;
	while (i<=n)
	{
		fact=fact*i;
		i++;
	}
	System.out.printf(" %d " ,fact);
}
}