class Animal{

	void Eat(){
		       System.out.println("eating.......");
		      }
		  }

class Dog extends Animal{

	void Bark(){
		        System.out.println("barking.......");
		       }
		   }

class Inh3{

	public static void main(String[] arg){

		Dog d=new Dog();

		d.Eat();
		d.Bark();
	}

}




