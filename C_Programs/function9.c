#include<stdio.h>
#include<conio.h>
//10 - wap to create function calarea with one int parameter to accept radius
//calculate and display area and circ of circle.

void calarea(int radius1)
{
	float area,circ;
	area=3.14f*radius1*radius1;
	printf("\n area=%f",area);
	circ=2*3.14f*radius1;
	printf("\n circ=%f",circ);

}

int main()
{
	int radius;
	printf("\n enter radius");
	scanf("%d",&radius);
	//calling the result function
	calarea(radius);
	printf("\n goodbye from the main function");
}
