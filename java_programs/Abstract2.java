abstract class Account{

abstract void deposit();   //abstract method (without body)

void withdrawl(){
System.out.println("non abstract method withdrawl called from Account class");
}
}

class Saving extends Account{

	 void deposit(){
		 System.out.println("non abstract method deposit called from class Saving");
		 }

}


class Abstract2{

public static void main(String[] arg){

//account act=new account();// error since you cannot create instance of abstract class

	Account act=null;

 act=new Saving();

 act.deposit();
}
}