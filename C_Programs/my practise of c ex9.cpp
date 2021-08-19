#include<stdio.h>
#include<conio.h>
int main()
{

char name[10] ;
printf("enter your name");
gets(name);//why gets is used instead of scanf
printf("your name is %s",name);
}
