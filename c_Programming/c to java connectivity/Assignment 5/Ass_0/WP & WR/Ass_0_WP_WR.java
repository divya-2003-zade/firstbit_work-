class Ass_0_WP_WR
{
    public static void main(String args[])
    {
        int no1 = 30, no2 = 20;

        int res1 = add(no1, no2);
        System.out.printf("1. Addition of two integers is %d\n\n", res1);


        float r = 3.0f;

        float res2 = find_area_of_circle(r);
        System.out.printf("2. Area of a circle is %f\n\n", res2);


        float temp = 50.0f;

        float res3 = find_temperature(temp);
        System.out.printf("3. Temperature from Celsius to Fahrenheit %f\n\n", res3);


        int a = 10, b = 20, c = 12, d = 15, e = 30;

        float res4 = find_avg(a, b, c, d, e);
        System.out.printf("4. Average of five numbers %f\n\n", res4);


        int base = 10, hgt = 2;

        int res5 = find_area_of_triangle(base, hgt);
        System.out.printf("5. Area of a Triangle is %d\n\n", res5);
    }


    static int add(int a, int b)
    {
        int c;

        c = a + b;

        return c;
    }


    static float find_area_of_circle(float r)
    {
        float area;

        area = 3.14f * r * r;

        return area;
    }


    static float find_temperature(float c)
    {
        float f;

        f = (c * 9 / 5) + 32;

        return f;
    }


    static float find_avg(int a, int b, int c, int d, int e)
    {
        float avg, sum;

        sum = a + b + c + d + e;
        avg = sum / 5.0f;

        return avg;
    }


    static int find_area_of_triangle(int base, int hgt)
    {
        int tri;

        tri = base * hgt / 2;

        return tri;
    }
}