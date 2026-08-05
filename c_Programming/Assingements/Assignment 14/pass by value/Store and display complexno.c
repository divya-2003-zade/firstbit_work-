#include<stdio.h>

struct Complex
{
    int real;
    int imaginary;
};
struct Complex store(struct Complex );
void  display(struct Complex );
void main()
{
    struct Complex c1;
         c1=store(c1);
         display(c1);
}
struct Complex store(struct Complex comp)
{
	printf("Enter Real and Imaginary Part: ");
    scanf("%d%d", &comp.real, &comp.imaginary);
    return comp;
}
void  display(struct Complex comp)
{
	printf("\nComplex Number = %d + %di", comp.real, comp.imaginary);
    printf("\nReal Part = %d", comp.real);
    printf("\nImaginary Part = %d", comp.imaginary);
}