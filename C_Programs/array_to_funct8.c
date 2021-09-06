//9	wap to accept 3 subject marks and print total,per and grade.

#include<stdio.h>

int main()
{
	int sub1,sub2,sub3;
	printf("\n enter 3 subject marks");
	scanf("%d%d%d",&sub1,&sub2,&sub3);
	
	result(sub1,sub2,sub3);
	
}

void result(int s1,int s2,int s3)
{
    int total;
    float per;
    
    total=s1+s2+s3;
    printf("\n total =%d",total);
    per=(float)(total/300.0f)*100.0f;
    fflush(stdin);
    printf("\n percentage =%f",per);
    
    if(per>=75)
    {
    	printf("\n grade=distinction");
	}
	else if(per>45 && per<75)
	{
		printf("\n grade=first division");
	}
	else
	{
		printf("\n grade= fail");
	}
	
	
	
}
