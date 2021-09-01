//4 example of enum weekdays
#include<stdio.h>

enum day
{
	monday=1,tuesday,wednesday,thursday,friday,saturday,sunday
	
};
 
 int main()
 {
 	enum day d;
 	d=wednesday;
 	printf("\n dayno=%d",d);
 }
