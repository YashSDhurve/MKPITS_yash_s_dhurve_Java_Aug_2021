//11 wap to pass rno(int) and name (string) to function to display it.

#include<stdio.h>

int main()
{ 
  int rno=234;
  char name[]="yashdhurve";
  display(rno,name);
  

 
 	
}

void display(int rn,char *name)
{
	printf("\nrollno= %d",rn);
	printf("\nname= %s",name);
}

