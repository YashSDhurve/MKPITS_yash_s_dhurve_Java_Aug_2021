#include<stdio.h>
#include<conio.h>
int main()
{
int s1,s2,s3,s4,s5,total,average;
printf("enter marks of 5 subjects");
scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
total = s1+s2+s3+s4+s5;
average = total/5;
printf("total =%d",total);
printf("/n average =%d",average);
}
