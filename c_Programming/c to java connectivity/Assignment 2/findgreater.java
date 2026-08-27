class findgreater
{
public static void main(String agrs[])
{
	int a=20,b=15,c=10;
	if (a>b)
	{
		if (a>c)
		{
			System.out.printf("The greates no. is a %d",a);
		}
		else
		{
			System.out.printf("The greates no. is c %d",c);
		}
	}
	else
	{
		if (b>c)
		{
			System.out.printf("The greates no. is b %d",b);
		}
		else
		{
			System.out.printf("The greates no. is c %d",c);
		}
	}
}
}