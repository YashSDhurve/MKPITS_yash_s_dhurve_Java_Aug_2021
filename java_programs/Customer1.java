package bank;

import sbi.Account;

class Customer1{

public static void main(String[] arg){

Account act= new Account();

String str= act.deposit(500);

System.out.println("bal="+str);

}

}