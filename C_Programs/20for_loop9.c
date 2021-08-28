//10 wap to accept age of 5 students using for loop and then display the average age. 
#include<stdio.h>
int main()
{
int age,avg,i,total;

for(i=1;i<=5;i++)
{
	printf("enter age");
	scanf("\n %d",&age);
	total=total+age;
}
	avg=total/5;
	printf("\n avg=%d",avg);


	
}
