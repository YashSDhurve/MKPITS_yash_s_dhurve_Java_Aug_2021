class Animal{

	 void  eat(){
			System.out.println("Animal is eating");
	}
}


class Dog1 extends Animal{

	 void  eat(){
		System.out.println("Dog is eating");
	}

public static void main(String[] arg){

	Animal a=new Dog1();

	a.eat();
}
}