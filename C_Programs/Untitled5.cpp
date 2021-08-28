#include<stdio.h>
 
int main(){
	int num,i=1,res;
	char ans;
	do{
		printf("\n enter a number");
		scanf("%d",&num);
		res=num*i;
		printf("\n %d * %d =%d",num,i,res);
		printf("\n do you want to continue ,if yes then press y otherwise n?");
		printf("%c",ans);
		fflush)(stdin);
	}
	while(ans=='y');
	printf("\n bye");
	return 0;
}
