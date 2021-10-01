abstract class Bike{

abstract void run();

}

class Passion extends Bike{

	void run(){
		System.out.println("Passion is running safely");
	}

	public static void main(String[] arg){

		Bike b=new Passion();
		b.run();
	}
}
