class perfectNo
{
public static void main(String args[])
{
	int n=145;
		 for (int i=1; i<n; i++)
 {
	int sum=0;
	for( int j=1; j<i; j++)
	{
	 if(i%j==0)
	 {
	   sum=sum+j;
	 }
    }
    if(sum==i)
    {
     System.out.printf("%d ",i);
    }
 }
	 
}
}