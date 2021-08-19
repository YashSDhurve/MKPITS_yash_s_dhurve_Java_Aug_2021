 
//2- //wap to accept a character and print whether it is vowel or not
#include<stdio.h>
int main()
{
char choice;
printf("enter any alphabet from a to z");
scanf("%c",&choice);
switch(choice)
{
	case'a':
    case'e':
    case'i':
    case'o':
	case'u':
		printf("\n alphabet is  a vowel");
	break;		
default:{
	printf("\n alphabet is not a vowel");
	break;
}


}
}

