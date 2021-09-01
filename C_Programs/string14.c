//15 strcmp 
//wap to compare two string



#include<string.h>

int main()
{ 
char name1[20];
char name2[15];

printf("enter name1 --");
gets(name1);
printf("enter name2 --");
gets(name2);

    if(strcmp(name1,name2)==0)
    {
    	printf("\n both strings are same");
	}
	else if
	(strcmp(name1,name2)!=0){
    	printf("\n both strings are different");
	}


 
 	
}


