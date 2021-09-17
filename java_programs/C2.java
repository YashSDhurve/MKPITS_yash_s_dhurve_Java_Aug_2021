//Example of static block

class C2{

static int num;

static{

System.out.println("static block invoked");
num=20;

}

public static void main(String[] arg){

System.out.println("hello from main");
System.out.println("num"+num);

}

}

