#include<stdio.h>
#include<conio.h>

//1-wap to accept account no. and amount and initial_bal=1000 and create function deposit, withdrawl and show_balance .

int main()
{
	int ac_no;
	int amt;
	int initial_bal=1000;
	printf("enter account no.");
	scanf("%d",&ac_no);
	printf("enter amount to be deposited");
	scanf("%d",&amt);
	deposit(ac_no,amt,initial_bal);
	withdrawl(ac_no,amt);
	show_bal(ac_no,initial_bal,amt);
}

void deposit(int ac_no,int amt,int initial_bal)
{   
    printf("\n account no.=%d",ac_no);
	printf("\n amount deposit=%d",amt);
	    int total_bal;
	total_bal=initial_bal+amt;
	printf("\n total balance=%d",total_bal);
	
}

void withdrawl(int ac_no,int amt,int initial_bal)
{   
    printf("\n account no.=%d",ac_no);
	int total_bal;
printf("\n amount withdrawl=%d",amt);
total_bal=initial_bal-amt;
	printf("\n total balance=%d",total_bal);
	
	
}

void show_bal(int ac_no,int initial_bal,int amt)
{   
    int total_bal;
	total_bal=initial_bal+amt;
	total_bal=initial_bal-amt;
	printf("\n account no.=%d",ac_no);
	printf("\n total balance=%d",total_bal);
	
}



