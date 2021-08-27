#include<stdio.h>
//8 -  wap of additon of 2 matrices ( ie create an arr1 of 3 rows and 3 cols , create another array arr2 of 3 rows and 3 cols ,
// then create array arr3  to to addtion of arr1 and arr2.)
int main()
{   
	int arr1[3][3]={{1,2,3} , {4,5,6} , {7,8,9}};
	int arr2[3][3];
	int row,col;
printf("\n arr1[3][3]\n");
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t %d",arr1[row][col]);
		}
		printf("\n");
	}

	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
		arr2[col][row]=arr1[row][col];
		}
		printf("\n");
	}
	
	printf("\n transpose of arr1[3][3]=\n");

	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
		printf("\t %d",arr2[row][col]);
		}
		printf("\n");
	}		


	
	
	
	
}
