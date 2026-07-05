//perfect number
void main ()
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
		printf("prefect");
	}
	else
	{
		printf(" Not perfect");
	}
}