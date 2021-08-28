#include<stdio.h>
#include<conio.h>
int main()
{
int basic_salary;
float hra,da,total_salary;
printf("enter basic_salary");
scanf("%d",&basic_salary);
hra = 25*0.01f *basic_salary;
da =  35*0.01f *basic_salary;
total_salary = hra+da+basic_salary;
printf("/n hra =%.2f",hra);
printf("/n da =%.2f",da);
printf("/n total_salary =%.2f",total_salary);
}
