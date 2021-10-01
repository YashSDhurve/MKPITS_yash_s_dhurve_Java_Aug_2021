class Account{
int actno;
int bal=1000;

String deposit(int actno,int amt){

return "deposit method from class account";
}

String withdrawl(int actno,int amt){

this.actno=actno;

if(amt>bal){

return "Insufficient balance";
}


{

bal=bal-amt;
return "amount withdrawl from the account no. " +actno+ ",bal = "+bal;
}
}
}

///////////////////////////////////////

class Saving extends Account{
int interest=500;

String deposit(int actno,int amt){

this.actno=actno;

bal=bal+amt+interest;

return "amount deposited in account no " +actno+ ",bal = " +bal;
}

String withdrawl(int actno,int amt){

	this.actno=actno;

if(amt>bal){

return "Insufficient balance";
}

{

bal=bal-amt;
return "amount withdrawl from the account no. " +actno+ ",bal = "+bal;
}
}
}
///////////////////////////////

class Current  extends Account{

String deposit(int actno,int amt){

this.actno=actno;

bal=bal+amt;

return "amount deposited in account no " +actno+ ",bal = " +bal;
}
}

class RunTimePoly3{

public static void main(String[] arg){

Account a1=null;

java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("Enter Account no.");
int actno=scan.nextInt();

System.out.println("Enter amount");
int amt=scan.nextInt();

System.out.println("Enter Account type");
String acttype=scan.next();

if(acttype.equals("Saving")){

 a1= new Saving();

}

if(acttype.equals("Current")){

 a1= new Current();

}

System.out.println("Do you want to deposit or withdrawl amount");
String ans=scan.next();


if(ans.equals("deposit")){
	String str = a1.deposit(actno,amt);
    System.out.println(str);
}

else if(ans.equals("withdrawl")){
	String str = a1.withdrawl(actno,amt);
    System.out.println(str);
}


}
}

