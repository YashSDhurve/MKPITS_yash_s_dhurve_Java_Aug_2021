//8 -wap to accept 3 no. and then print smallest no.
#include<stdio.h>
int main()
{
	int num1,num2,num3;
	    printf("enter number num1");
	scanf("%d",&num1);
		printf("enter number num2");
	scanf("%d",&num2);
	    printf("enter number num3");
	scanf("%d",&num3);
	if(num1<num2 && num1<num3)
	{
		printf("\n num1 is smallest no");
	}
	else if(num2<num1 && num2<num3)
	{
		printf("\n num2 is smallest no");
	}
	if(num3<num1 && num3<num2)
	{
		printf("\n num3 is smallest no");
}
	

}




