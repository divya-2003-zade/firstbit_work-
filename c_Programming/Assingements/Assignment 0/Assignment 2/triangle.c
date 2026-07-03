void main()
{
	int a=5, b=4, c=6;
	if(a+b>c && a+c>b && b+c>a)
	{
		if(a==b && a==c)
		{
			printf("triangle is an isosceles.");
		}
		
	}
	else
	{
		if(a!=b || a!=c || b!=c)
		{
			
			printf("triangle is scalene.");
		}
		else
		{
			if(a==b && a==c && b==c)
			{
				printf("triangle is an Equilateral.");
			}
		}
	}
}