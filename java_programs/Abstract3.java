import java.util.*;

abstract class Account{
                     	int actno;
                    	int bal=2000;

          abstract String deposit(int actno,int amt);

             String withdrawl(int actno,int amt){
	                                            this.actno=actno;
	                                     		if(amt>bal){return "insufficient balance in "+actno;}

	                                     		{  bal=bal-amt;
	                                      		return "amount withdrawl from  account number -" +actno+ ", balance = "+bal;}
	                                      		}

                       }

class Saving extends Account{

	int interest=600;

	String deposit(int actno,int amt){
this.actno=actno;
	bal=bal+amt+interest;
	return "amount deposited in account number -" +actno+ ", balance = "+bal;
                                     }

                            }

class Current extends Account{

	String deposit(int actno,int amt){
this.actno=actno;
	bal=bal+amt;
	return "amount deposited in account number -" +actno+ ", balance = "+bal;
	}
                             }

class Abstract3{

	public static void main(String[] arg){

Scanner scan=new Scanner(System.in);

System.out.println("enter account number");
int actno=scan.nextInt();

System.out.println("enter amount");
int amt=scan.nextInt();

System.out.println("enter account type");
String acttype=scan.next();

Account act=null;

if(acttype.equals("Saving")){
	act=new Saving();
}

else if(acttype.equals("Current")){
	act=new Current();
}

System.out.println("Do you want to deposit or withdrawl ?");
String ans=scan.next();

String str;

if(ans.equals("deposit")){

     str=act.deposit(actno,amt);
	 System.out.println(str);
}

else if(ans.equals("withdrawl")){

	  str=act.withdrawl(actno,amt);
	 System.out.println(str);
}



}
}




