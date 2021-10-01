class Overld13{

	void sum(int n1,long n2){

		System.out.println( n1+n2);

	}

	void sum(int n1,int n2,int n3){

			int res=n1+n2+n3;

			System.out.println(n1+n2+n3);

	}

	public static void main(String[] arg){

		Overld13 o = new Overld13();

		o.sum(1,2);      //complier will promote the int value to long

		o.sum(1,2,3);

	}

}