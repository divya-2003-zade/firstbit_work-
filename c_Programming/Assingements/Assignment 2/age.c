void main()
{
	int age =25;
	if(age < 12)
	{
		printf("This is a child");
	}
	else 
	{
		if( age >= 12 && age <= 19)
		{
		printf("This is a Teenager");
		}
		else
	     {
		  if(age >= 20 && age < 60) 
		 {
		 printf("This a Adult age");
	     }
	        else
	         {
	    	   if(age>=60)
	    	    {
	    		   printf("This is a seinor citizen");
			    }
			}
		}
	}
}