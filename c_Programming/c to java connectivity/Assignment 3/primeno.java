class primeno
{
public static void main(String args[])
{
    int num=7;
    int i=2;

    while(i<num)
    {
        if(num%i==0)
        {
            System.out.printf("No is not prime");   // Not Prime
        }
        i++;
    }
    System.out.printf("No is prime");          // Prime
}
}
