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

	public static void main(String[] arg){

		Animal a=new BabyDog();

        a.eat();
	}
}



//Since, BabyDog is not overriding the eat() method, so eat() method of Dog class is invoked.