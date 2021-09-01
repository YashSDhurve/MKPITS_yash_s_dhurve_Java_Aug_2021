//7-Let's see how we can use an enum in a switch case statement.
#include<stdio.h>

enum day
{
sunday=1, monday, tuesday, wednesday, thursday, friday, saturday
	
}d;
 
 int main()
 {
 	d=wednesday;
switch(d)
{
	case sunday:
		printf("\n today is sunday");
		break;
			case monday:
		printf("\n today is monday");
		break;
			case tuesday:
		printf("\n today is tuesday");
		break;
			case wednesday:
		printf("\n today is wednesday");
		break;
			case thursday:
		printf("\n today is thursday");
		break;
			case friday:
		printf("\n today is friday");
		break;
			case saturday:
		printf("\n today is saturday");
		break;
}
 
 
 
 
 
 }
