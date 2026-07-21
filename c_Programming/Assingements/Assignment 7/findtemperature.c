#include<stdio.h>
void find_temperature(float*);

void main()
{
	float f;
	printf("Enter a temperature in celcius : ");
	scanf("%f",&f);
	find_temperature(&f);
}
void find_temperature(float*c)
{
	float Fahrenheit;
	Fahrenheit=(*c*9/5)+32;
	printf("Temperature from celsius to Fahrenheit %f",Fahrenheit);
}