class Animal{

	Animal(){

		System.out.println("Animal is created");}

	       }

class Dog extends Animal{

	Dog(){

		super();

		System.out.println("Dog is created");

	}

					    }

class SuperEx7{

	public static void main(String[] arg){

		Dog d=new Dog();

	}

}




