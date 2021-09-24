class Animal{
            String color="white";
            }

class Dog extends Animal{
                        String color="black";

                         void printColor(){

                         System.out.println("Color : "+super.color);       //this will print white color

					 }
			     		 }

class BabyDog extends Dog{
                        String color="Brown";

             void printColor1(){

             System.out.println("Color : "+color);      //this will print brown color

             System.out.println("Color : "+super.color);      //this will print black color

             printColor();

                             }

					 }


 class SuperEx2{

 public static void main(String[] arg){

 BabyDog b=new BabyDog();

 b.printColor1();

 }

 }
