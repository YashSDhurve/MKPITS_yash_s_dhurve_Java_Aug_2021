class Bank{

int getRateOfInterest(){

	return 0;
}
}

class SBI extends Bank{

int getRateOfInterest(){

	return 7;
}
}

class AXIS extends Bank{

	int getRateOfInterest(){

		return 8;
}
}

class ICICI extends Bank{

	int getRateOfInterest(){

		return 9;
}
}

class RunTimePoly2{

	public static void main(String[] arg){

		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter Bank Name");
		String bn=scan.next();

		Bank b;

		if(bn.equals("SBI")){
		b=new SBI();
		System.out.println(b.getRateOfInterest());
	}

	}
}


