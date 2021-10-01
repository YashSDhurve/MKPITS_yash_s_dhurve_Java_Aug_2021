//2) Method Overloading: changing data type of arguments

//In this example, we have created two methods that differs in data type.
//The first add method receives two integer arguments and second add method receives two double arguments.

class Adder{

	static int Add(int num1,int num2){

		return num1+num2;

	}

	static float Add(float num1,float num2){

			return num1+num2;

	}

}

class Overld6{

	public static void main(String[] arg){

		System.out.println(Adder.Add(1,2));

		System.out.println(Adder.Add(1.1f,2.2f));

	}

}
