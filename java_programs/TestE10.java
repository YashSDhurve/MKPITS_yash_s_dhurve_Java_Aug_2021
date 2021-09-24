//Let's see another example of encapsulation that has only four fields with its setter and getter methods.

//A Account class which is a fully encapsulated class.
    //It has a private data member and getter and setter methods.

class Account{

	    private long  acc_no;
	    private String name,email;
	    private float amount;

public void setAcc_no(long acc_no){

	this.acc_no=acc_no;

}

public long getAcc_no(){

	return acc_no;

}

public void setName(String name){

	this.name=name;

}

public String getName(){

	return name;

}

public void setEmail(String email){

	this.email=email;

}

public String getEmail(){

	return email;

}

public void setAmount(float amount){

	this.amount=amount;

}

public float getAmount(){

	return amount;

}

}

class TestE10{

	public static void main(String[] arg){

		Account a = new Account();

		a.setAcc_no(123456789101L);
		System.out.println("Account number= "+a.getAcc_no());

		a.setName("Yash Dhurve");
		System.out.println("Account holder's name= "+a.getName());

		a.setEmail("yash43075@gmail.com");
		System.out.println("Account holder's Email address= "+a.getEmail());

		a.setAmount(3100f);
		System.out.println("Account number= "+a.getAmount());

	}

}