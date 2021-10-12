
class TestArrayException15{

	public static void main(String[] arg){


		//creating method which returns an array

			static int[] get(){

			int a[]={99,88,76,94,55};

			 return a;

		}

		//calling method which returns an array

		int arr[] = get();

		for(int i=0;i<6;i++){
		System.out.println(arr[i]);

 }
}