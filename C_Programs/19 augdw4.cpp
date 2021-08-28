//5 wap to print table of a number 
#include<stdio.h>
int main()
{
int num,i=1,table
char ans;
do{
	printf("\n enter number");
scanf("%d",&num);
table=num*i;
printf("\n %d * %d=%d",num,i,table);
printf("\n do want to continue if yes then press y otherwise n?");
fflush(stdin);	
}
while(i<=10);
printf("\n bye");
}


