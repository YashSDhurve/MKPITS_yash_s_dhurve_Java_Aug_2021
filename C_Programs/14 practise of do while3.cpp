 
//6 wap to accept a number and print square of that number program should ask the user whether to continue or not if user presses 'y' and then it should ask for another numberif user presses 'n' the program should end


#include<stdio.h>
int main()
{
	int num,square;
	char ans;
	do{
	printf("enter a number");
	scanf("%d",&num);
	square=num*num;
	printf("\n square of number =%d",square);
	printf("\n do you want to contiue if yes then press y otherwise n");
	scanf("\n %c",&ans);
	
	fflush(stdin);
	
		
	}
while(ans=='y');
printf("\n bye");
	



}

