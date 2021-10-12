
class TestReturnArray13{

	//creating method which returns an array

	static int[] get(){

		   int a[]={99,88,76,94,55};

		   return a;

		}

	public static void main(String[] arg){

		//calling method which returns an array

		int arr[] = get();

		for(int i : arr){
		System.out.println(i);
	             }
        }

}