class Bike{

	void run(){
		System.out.println("running.........");
	}
}

class Splender extends Bike{

	void run(){
		System.out.println("splender is running at the speed of 50kmph");
	}
}

class Pulser extends Bike{

	void run(){
		System.out.println("pulser running at the speed of 90kmph");
	}
}


class RunTimePoly4{

	public static void main(String[] arg){

		Bike b;

		b= new Splender();
		b.run();
		b=new Pulser();
		b.run();
	}
}