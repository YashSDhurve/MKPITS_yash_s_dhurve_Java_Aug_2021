//3) this() : to invoke current class constructor

//The this() constructor call can be used to invoke the current class constructor.
//It is used to reuse the constructor. In other words, it is used for constructor chaining.

//Calling default constructor from parameterized constructor:

class A{

	A(){

		System.out.println("hello from A");

	   }

	A(int x){
             this();

            System.out.println("hello from A(int x)");

		    System.out.println("x="+x);

		   }

	   }

class TestThis8{

	public static void main(String[] arg){

		A a=new A(20);


	}

}

