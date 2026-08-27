class strongNo
{
public static void main(String args[])
{
	int n=200;
		for( int i=1; i<=n; i++)
	{
		int temp=i;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int fact=1;
			for(int j=1; j<=rem; j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		{
			System.out.printf("%d ",i);
		}
	}
}
}