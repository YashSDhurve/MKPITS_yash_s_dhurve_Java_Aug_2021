class Overld14{

	void sum(int n1,int n2){

		System.out.println("int arg method is invoked");

		System.out.println( n1+n2);

	}

	void sum(long n1,long n2){


		System.out.println("long arg method is invoked");

			System.out.println(n1+n2);

	}

	public static void main(String[] arg){

		Overld14 o = new Overld14();

		o.sum(1,2);

	}

}