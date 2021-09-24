class Animal{
            String color="white";
            }

class Dog extends Animal{
                        String color="black";

             void printColor(){

             System.out.println("Color : "+color);      //this will print black color

             System.out.println("Color : "+super.color);      //this will print white color

                             }

					 }

 class SuperEx1{

 public static void main(String[] arg){

 Dog d=new Dog();

 d.printColor();

 }

 }
