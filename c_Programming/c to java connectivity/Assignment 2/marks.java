class marks
{
public static void main(String args[])
{
	int marks = 35;
	if(marks>=75)
	{
		System.out.printf("Distinction");
	}
	else
	{
		if(marks>=65)
		{
			System.out.printf("First class");
		}
		else
		{
			if(marks>=55)
			{
				System.out.printf("second class");
			}
			else
			{
				if(marks>=40)
				{
					System.out.printf("pass class");
				}
				else
				{
					if(marks<=40)
					{
						System.out.printf("fail");
					}
				}
			}
		}
	}
	
	
}
}