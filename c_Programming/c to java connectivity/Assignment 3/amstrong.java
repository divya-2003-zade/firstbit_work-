class amstrong
{
public static void main(String args[])
{
	int rem, sum=0, org;
	int no=153;
	org=no;
	while(no !=0 )
	{
		
		rem=no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
	}
    if(sum==org)
	    {
		    System.out.printf("Amstrong");
	    }
	    else
	    {
	    	System.out.printf("not amstrong");
		}
}
}