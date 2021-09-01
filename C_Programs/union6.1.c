//7 create a union customer with member custid(int) , custname(char array) , mobileno(double)


union customer
{
	int custid;
	char custname[20];
	double mobileno;
}c1;

int main()
{   

	printf("\n enter customer id-");
	scanf("%d",&c1.custid);
	printf("\n customer id--%d",c1.custid);
	printf("\n enter customer name-");
	scanf("%s",&c1.custname);
	printf("\n customer name--%s",c1.custname);
	printf("\n enter mobile no.-");
	scanf("%lf",&c1.mobileno);
	printf("\n customer mobile no.--%.0lf",c1.mobileno);		





   
	
	
}
