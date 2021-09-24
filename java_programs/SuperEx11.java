//assignment
//create a parent class account having fields accountno and balance. and constructor with 2 parameters
//create a subclass saving inherited from account class having fields interest
//and constructor with 3 parameters and from this call parent class constructor.
//and a display method, deposit method and withdrawl method.

class Account{

	long actno;
	float balance;

	Account(long actno,float balance){
                                	  this.actno=actno;
		                              this.balance=balance;
                                     }

             }

class Saving extends Account{

	float interest;
	int amt;

	Saving(long actno,float balance,float interest){
		                                            super(actno,balance);
		                                            this.interest=interest;
												   }

	void display(){

		System.out.println("Account number="+actno);

		System.out.println("Balance="+balance);

		System.out.println("Interest="+interest);

		this.deposit(200);

		this.withdrawl(100);
	}

 void deposit(int amt){

	this.amt=amt;

	System.out.println("amount deposited="+amt);
}

void withdrawl(int amt){

	this.amt=amt;

	System.out.println("amount withdrawl="+amt);
}

}

class SuperEx11{

	public static void main(String[] arg){

		Saving s=new Saving(123456789098l,10000f,3f);

		s.display();



	}

}




