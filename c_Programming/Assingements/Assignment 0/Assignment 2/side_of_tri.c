void main()
{
	int a=3,b=4,c=6;
	if(a==b &&  b==c)
	{
		printf("The triangle is equliteral");// all sides are equal 
	}
	else
	{
		if(a == b || b == c || a == c)
		{
			printf("The triangle is isosceles");// two side are equal
		}
		else
		{
			if(a != b || a != c || b != c)
			{
				printf("The triangle is scalene");// all side are diff
			}
		
		}
	}
	
}