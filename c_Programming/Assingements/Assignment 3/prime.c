//Check the given number is prime or not.
//Input: n = 7
//prime number
void main()
{
	int prime()
{
    int num=7;
    int i=2;

    while(i<num)
    {
        if(num%i==0)
        {
            return 0;   // Not Prime
        }
        i++;
    }
    return 1;           // Prime
}
}