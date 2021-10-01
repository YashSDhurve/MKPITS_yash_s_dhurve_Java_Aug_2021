class Animal{

	void eat(){
		System.out.println("eating........");
	}
}

class Dog extends Animal{

	void eat(){
			System.out.println("eating pedigree........");
	}
}

class BabyDog extends Dog{

	void eat(){
			System.out.println("drinking milk........");
	}
}

class RunTimePoly8{

	public static void main(String[] arg){

		Animal a,d,b;

        a=new Animal();
		d=new Dog();
		b=new BabyDog();

        a.eat();
		d.eat();
		b.eat();
	}
}
