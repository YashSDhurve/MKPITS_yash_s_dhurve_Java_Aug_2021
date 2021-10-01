//Runtime Polymorphism in Java

//creating Parent class

class Parent{
         
void display(){
              System.out.println("Parent class display method");
              }
              
            } 
            
//creating child class inherited from Parent class

class Child extends Parent{

//overriding display method
         
void display(){
              System.out.println("Child class display method");
              }
              
            }
            
class RunTmePoly1{

public static void main(String[] arg){

Parent p=new Child();

p.display();

}

}