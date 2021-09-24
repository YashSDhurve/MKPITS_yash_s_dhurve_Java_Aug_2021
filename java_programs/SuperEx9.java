//Another example of super keyword where super() is provided by the compiler implicitly.

class Animal{
    Animal(){System.out.println("animal is created");}
    }
    class Dog extends Animal{
    Dog(){
		                                                        //without invoking the parent class constructor it will invoke by the compiler
		                                                        // ie super()
    System.out.println("dog is created");
    }
    }
    class SuperEx9{
    public static void main(String args[]){
    Dog d=new Dog();
    }}
