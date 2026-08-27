class perfectno
{
public static void main (String args[])
{
	int n=28;
	int i=1, sum=0;
	while(i<n)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if (sum==n)
	{
		System.out.printf("prefect");
	}
	else
	{
		System.out.printf(" Not perfect");
	}
}
}