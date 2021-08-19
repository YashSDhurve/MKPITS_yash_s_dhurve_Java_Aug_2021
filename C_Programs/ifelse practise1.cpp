#include<stdio.h>
#include<conio.h>
int main()
{
	// 2- wap to accept age from the user and display whether he is elegible to vote or not.
	int age;
	printf("enter your age");
	scanf("%d",&age);
	if(age>=18){
		printf("\n you are eligible to vote");
	}
	else{
		printf("\n you are not eligible to vote");
	}
}
