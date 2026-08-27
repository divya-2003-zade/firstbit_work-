class Age
{
	public static void main(String args[])
{
	int age =25;
	if(age < 12)
	{
		System.out.printf("This is a child");
	}
	else 
	{
		if( age >= 12 && age <= 19)
		{
		System.out.printf("This is a Teenager");
		}
		else
	     {
		  if(age >= 20 && age < 60) 
		 {
		 System.out.printf("This a Adult age");
	     }
	        else
	         {
	    	   if(age>=60)
	    	    {
	    		   System.out.printf("This is a seinor citizen");
			    }
			}
		}
	}
}
} 