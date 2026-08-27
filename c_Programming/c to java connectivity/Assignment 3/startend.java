class startend
{
public static void main(String args[])
{
	int start=1, end=5;
	int sum=0;
	while ( start <= end)
	{
		sum=sum+start;
		start++;
	}
	System.out.printf("sum = %d ", sum);
}
}