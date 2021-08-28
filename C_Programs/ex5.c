// structure of c program
int main()
{
int radius  ;
float area, circ;
printf("enter radius of a circle");

scanf("%d",&radius);

area= 3.14f * radius * radius ;
circ = 2 * 3.14f * radius;

printf("area of circle = %f", area);
printf("/ncircumferance of circle = %f ",circ);


}
