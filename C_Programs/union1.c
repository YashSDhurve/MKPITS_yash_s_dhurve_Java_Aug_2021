//2 -example of union declaring union varaiable inside main function

union data
{
	int i;
	float j;
	char name[10];
};

int main()
{   
     union data d1;

	d1.i=50;
	printf(" int value =%d",d1.i);
		d1.j=50.50;
	printf("\n float value =%f",d1.j);
		strcpy(d1.name,"yash");
	printf("\n name-%s",d1.name);
	
	
}
