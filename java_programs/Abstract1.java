abstract class Account{

abstract void deposit();   //abstract method (without body)

void withdrawl(){
System.out.println("non abstract method withdrawl called");
}
}

class Abstract1{

public static void main(String[] arg){

Account a=new Account();
}
}