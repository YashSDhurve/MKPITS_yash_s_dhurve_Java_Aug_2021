//17 wap to find whether string is palindrome or not 
//(palindrome after reversing the string should be same ie madam)





#include<string.h>

int main()
{
char name[20]; 
char orgname[20];
char revname[20];



printf("enter name --");
gets(name);

strcpy(orgname,name);
printf("\n orgname--%s",orgname);
strrev(name);
printf("\n after reversing--%s",name);
printf("\n revname--%s",name);

if(strcmp(orgname,name)==0)
{
	printf("\n the string is pelindrome");
}

else{
	printf("\n the string is not pelindrome");
}






 
 	
}


