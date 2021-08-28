//3example of continue;
//wap to print odd no. between 1 and 10 using continue



#include<stdio.h>
int main()
{
	int num=0;
	while(num<10)
	{
		num++;
		if(num%2==0)
		{
			continue;
		}
		printf("\n %d",num);
	}
	printf("\n out of while loop");
	}
