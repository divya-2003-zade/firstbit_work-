#include<stdio.h>

struct Complex
{
    int real;
    int imaginary;
};

void main()
{
    struct Complex c1;

    printf("Enter Real and Imaginary Part: ");
    scanf("%d%d", &c1.real, &c1.imaginary);

    printf("\nComplex Number = %d + %di", c1.real, c1.imaginary);
    printf("\nReal Part = %d", c1.real);
    printf("\nImaginary Part = %d", c1.imaginary);
}