class AmstrongNo 
{
    public static void main(String args[]) 
    {
        int n = 10;

        for(int i = 1; i <= n; i++) 
        {
            int temp = i;
            int count = 0;
            int sum = 0;

            // Count digits
            for(int j = i; j > 0; j = j / 10) 
            {
                count++;
            }

            // Calculate Armstrong sum
            for(int j = i; j > 0; j = j / 10) 
            {
                int rem = j % 10;
                int x = 1;

                for(int k = 1; k <= count; k++) 
                {
                    x = x * rem;
                }

                sum = sum + x;
            }

            // Check Armstrong number
            if(sum == temp)
            {
                System.out.printf("Armstrong = %d\n", temp);
            }
                    }
    }
}