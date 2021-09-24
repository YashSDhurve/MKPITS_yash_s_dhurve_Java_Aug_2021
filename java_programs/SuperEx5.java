class Animal{
            void eat(){

				 System.out.println("Eating............. ");

			         }

            }

class Dog extends Animal{

	                     void eat(){

								    System.out.println("Eating bread. ");

			                       }


                         void bark(){

									 System.out.println("Barking............. ");

			                        }

			             void work(){

				                    super.eat();               //This will show - Eating..............

				                    eat();                     //This will show - Eating bread.

                                    bark();                    //This will show - barking..........


								    }

			              }


 class SuperEx5{

 public static void main(String[] arg){

 Dog d=new Dog();

 d.work();

 }

 }
