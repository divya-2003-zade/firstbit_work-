// amstrong number
void main()
{
	int rem, sum=0, org;
	int no=153;
	no=org;
	while(no !=0 )
	{
		
		rem=no%10;
		sum=sum+rem*rem*rem;
		no=no/10;
	}
    if(sum==org)
	    {
		    printf("Amstrong");
	    }
	    else
	    {
	    	printf("not amstrong");
		}
}