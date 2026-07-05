//prime number
void main()
{
	int num=7;
	int i=2;
	while(i<num)
	{
		if(num%i==0)
		{
			printf("not prime");
		}
		i++;
	}
	printf("prime");
}