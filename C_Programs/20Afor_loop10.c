//6 - wap to accept 5 subject marks and print total , percentage and grade(if else)
#include<stdio.h>
int main()
{
int s1,s2,s3,s4,s5,total;
float per;
printf("enter marks");
scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
total=s1+s2+s3+s4+s5;
per=(float)(total/500.0f)*100.0f;
printf("per =%f",per);

if(per>=75)
{
	printf("\n grade=distinction");
}
else if(per>65 && per<75)
{
	printf("\n grade =first class");
}
else if(per>=35 && per<65)
{
	printf("\n grade=avg");
}
}




