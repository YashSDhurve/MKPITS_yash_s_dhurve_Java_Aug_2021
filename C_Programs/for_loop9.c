#include<stdio.h>
//9 - wap to accept 5 subject marks using for loop and print total and percentage and calculate and display grade using if else if statement.

int main()
{
int marks,total,i;
float per;
for(i=1;i<=5;i++)
{
printf("\n enter marks");
scanf("%d",&marks);
total=total+marks;
}
printf("\n total marks=%d",total);
per=(float)total/500.0f*100.0f;
printf("\n per=%0.2f",per);

}

