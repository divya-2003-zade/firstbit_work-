#include<stdio.h>

typedef struct Complex
{
    int real;
    int imaginary;
}Complex;
void store( Complex* );
void  display(Complex* );
void main()
{
     Complex c1;
         store(&c1);
         display(&c1);
}
void store(Complex* comp)
{
	printf("Enter Real and Imaginary Part: ");
    scanf("%d%d", &comp->real, &comp->imaginary);
}
void  display(Complex* comp)
{
	printf("\nComplex Number = %d + %di", comp->real, comp->imaginary);
    printf("\nReal Part = %d", comp->real);
    printf("\nImaginary Part = %d", comp->imaginary);
}