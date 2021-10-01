class Calculate{

void Add(int n1,int n2){

int res=n1+n2;
System.out.println("result="+res);

}

void Add(int n1,int n2,int n3){

int res=n1+n2+n3;
System.out.println("result="+res);

}

}

class Overld1{
public static void main(String[] arg){

Calculate c= new Calculate();

c.Add(4,5);
c.Add(3,4,5);

}

}