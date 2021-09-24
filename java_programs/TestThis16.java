//4) this: to pass as an argument in the method
//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. Let's see the example:

class TestThis16{

	void m(TestThis16){

		System.out.println("method is invoked");

	}

	void p(){

		m(this);

	}

	public static void main(String[] arg){

	TestThis16 s1= new TestThis16();

		s1.p();

	}

}
