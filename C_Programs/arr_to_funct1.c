#include<stdio.h>
//2- create a array of 3 elements and pass it to the funtion display to display the elements of an array 
//using for loop

int main()
{
	int arr[3]={1,2,3};
	display(arr);
	
}

void display(int arr[])
{
	int i;
	for(i=0;i<3;i++){
	
	printf("\n arr[%d]=%d",i,arr[i]);
	
}
}

