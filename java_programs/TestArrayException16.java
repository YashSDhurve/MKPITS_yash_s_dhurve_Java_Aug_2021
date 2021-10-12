
class TestArrayException16{

	public static void main(String[] arg){

			int a[]={99,88,76,94,55};

		for(int i=0;i<6;i++){
			try{

		System.out.println(a[i]);

	        }catch(ArrayIndexOutOfBoundsException ee){System.out.println(ee);}
}


		System.out.println("Success");

 }
}