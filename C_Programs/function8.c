#include<stdio.h>
#include<conio.h>
//9 - wap to create function result with 3 int parameters to accept 3 subject marks
//calculate and display total, percentage and grade.
void result(int s1,int s2,int s3)
{
	int total;
	float percentage;
	total=s1+s2+s3;
	printf("\n total=%d",total);
	percentage=(total/300.0f)*100.0f;
	printf("\n percentage=%f",percentage);
	if(percentage>=75)
	{
		printf("\n grade=distinction");
	}
	else if(percentage<75 && percentage>60)
	{
		printf("\n grade=first");
	}
	else if(percentage>=35 && percentage<60)
	{
		printf("\n grade=second");
	}
	if(percentage<35)
	{
		printf("\n grade=fail");
	}
	

	
}

int main()
{
	int sub1,sub2,sub3;
	printf("\n enter marks of 3 subjects");
	scanf("%d%d%d",&sub1,&sub2,&sub3);
	//calling the result function
	result(sub1,sub2,sub3);
	printf("\n goodbye from the main function");
}
