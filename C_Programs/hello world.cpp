#include<stdio.h>
int main()
{
int radius;
float area,circ;
printf("enter radius of circle");
scanf("%d",&radius);
area = 3.14f*radius*radius;
circ = 2*3.14f*radius;
printf("\n area =%.2f",area);
printf("\n circ =%.2f",circ);
}
