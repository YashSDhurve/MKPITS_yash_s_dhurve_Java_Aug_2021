#include<stdio.h>

//4-create an array to store 5 productname and price and display the product name and
// pass array to function to calculate price

int main()
{
char prod_name[5][20];// 2d array for rows and 20 col
int price[5],i;
for(i=0;i<5;i++)
{
printf("\n enter product name_");
scanf("%s",&prod_name[i]);
printf("\n enter price of product");
scanf("%d",&price[i]);
}

for(i=0;i<5;i++)
{
	printf("\n product_name=%s",prod_name[i]);
}

cal_price(price);
		
}

void cal_price(int prod[])
{
	int i,total=0;
	
	for(i=0;i<5;i++)
	{
		total=total+prod[i];
    } 
		printf("\n total price of products= %d",total);
	
	
}
