#include<stdio.h>
void find_areacircle(float*);
void main()
{
	float r;
	printf("Enter a radius of circle :");
	scanf("%f",&r);
	find_areacircle(&r);
}
void find_areacircle(float*r)
{
	float cir;
	float *area= &cir;
	
 *area=3.14*(*r)*(*r);
	printf("Area of a circle is %f",*area);
}