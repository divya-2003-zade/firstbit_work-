void main()
{
    int a=9, b=3,c;
	char op='*';
	if(op=='+')
	{
	c=a+b;
	printf("The addition of two no. is %d",c);	
	}
	else
	{
		if( op =='-')
		{
	       c=a-b;
	       printf("The substraction of two no. is %d",c);	
	    }
	    else
		{
			if(op =='*')
		  {
	         c=a*b;
	         printf("The multiplication of two no. is %d",c);	
	      }
	      else
	      {
	      	if(op =='/')
		    {
	          c=a/b;
	          printf("The Division of two no. is %d",c);	
	        }
	        else
	        {
	        	if( op=='%')
		         {
	               c=a%b;
	               printf("The mode of two no. is %d",c);	
	             }
			}
		  }
		}
   }
}