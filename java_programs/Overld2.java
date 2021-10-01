class Calculate{

static int Add(int n1,int n2){

 return n1+n2;


}

static int Add(int n1,int n2,int n3){

return n1+n2+n3;

}

}

class Overld2{
public static void main(String[] arg){

System.out.println(Calculate.Add(1,2));

System.out.println(Calculate.Add(1,2,3));

}

}