//3) this() : to invoke current class constructor

//The this() constructor call can be used to invoke the current class constructor.
//It is used to reuse the constructor. In other words, it is used for constructor chaining.

//Calling default constructor from parameterized constructor:

class Book{

	String title;
	int price;

	//Creating constructor no  parameter

	Book(){

		System.out.println("constructor with no arg called");

		title="physics";
		price=100;
		this.display();
	}

//Creating constructor with 2 parameter
	Book(String title,int price){

		this();

         System.out.println("constructor with  2 parameter called");

		this.title=title;
		this.price=price;
	}

	void display(){

		System.out.println("title:"+title);
		System.out.println("price="+price);
	}

}

class TestThis9{
	public static void main(String[] arg){

		Book b=new Book("chemistry",300);
		b.display();
	}
}


