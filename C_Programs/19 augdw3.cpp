
#include<stdio.h>
int main()
{
int num,square;
char ans;
do{
	printf("enter a number");
    scanf("\n %d",&num);
    square=num*num;
    printf("\n square =%d",square);
    printf("\n do you want to continue,if yes then press y otherwise n?");
    fflush(stdin);
    scanf("\n %c",&ans);
}
while(ans=='y');
printf("\n bye");	
}


