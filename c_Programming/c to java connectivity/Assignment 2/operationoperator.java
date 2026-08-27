class operationoperator
{
public static void main(String args[])
{
    int a=9, b=3,c;
	char op='*';
	if(op=='+')
	{
	c=a+b;
	System.out.printf("The addition of two no. is %d",c);	
	}
	else
	{
		if( op =='-')
		{
	       c=a-b;
	       System.out.printf("The substraction of two no. is %d",c);	
	    }
	    else
		{
			if(op =='*')
		  {
	         c=a*b;
	         System.out.printf("The multiplication of two no. is %d",c);	
	      }
	      else
	      {
	      	if(op =='/')
		    {
	          c=a/b;
	          System.out.printf("The Division of two no. is %d",c);	
	        }
	        else
	        {
	        	if( op=='%')
		         {
	               c=a%b;
	               System.out.printf("The mode of two no. is %d",c);	
	             }
			}
		  }
		}
   }
}
}