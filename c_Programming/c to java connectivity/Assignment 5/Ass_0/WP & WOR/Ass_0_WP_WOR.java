class Ass_0_WP_WOR
{
    public static void main(String args[])
    {
        int no1 = 30, no2 = 20;
        add(no1, no2);

        float r = 3.0f;
        find_area_of_circle(r);

        float temp = 50.0f;
        find_temperature(temp);

        int a = 10, b = 20, c = 12, d = 15, e = 30;
        find_avg(a, b, c, d, e);

        int base = 10, hgt = 2;
        find_area_of_triangle(base, hgt);
    }

    static void add(int a, int b)
    {
        int c;
        c = a + b;

        System.out.printf("1. Addition of two integers is %d\n\n", c);
    }

    static void find_area_of_circle(float r)
    {
        double area;
        area = 3.14f * r * r;

        System.out.printf("2. Area of a circle is %f\n\n", area);
    }

    static void find_temperature(float c)
    {
        double f;
        f = (c * 9 / 5) + 32;

        System.out.printf("3. Temperature from Celsius to Fahrenheit %f\n\n", f);
    }

    static void find_avg(int a, int b, int c, int d, int e)
    {
        double avg, sum;

        sum = a + b + c + d + e;
        avg = sum / 5.0f;

        System.out.printf("4. Average of five numbers %f\n\n", avg);
    }

    static void find_area_of_triangle(int base, int hgt)
    {
        int tri;
        tri = base * hgt / 2;

        System.out.printf("5. Area of a Triangle is %d\n\n", tri);
    }
}