class A{

void m(){

System.out.println("hello from class m()");

}

void n(){

System.out.println("hello from class n()");

this.m();    // calling class m()

//automatically invoking class m() by comiler since m() and this.m() are same

}
}

class TestThis6{

public static void main(String[] arg){

A a=new A();

a.n();

}
}
