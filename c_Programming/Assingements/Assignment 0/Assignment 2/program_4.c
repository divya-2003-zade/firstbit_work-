void main()
{
	int marks = 35;
	if(marks>=75)
	{
		printf("Distinction");
	}
	else
	{
		if(marks>=65)
		{
			printf("First class");
		}
		else
		{
			if(marks>=55)
			{
				printf("second class");
			}
			else
			{
				if(marks>=40)
				{
					printf("pass class");
				}
				else
				{
					if(marks<=40)
					{
						printf("fail");
					}
				}
			}
		}
	}
	
	
}
