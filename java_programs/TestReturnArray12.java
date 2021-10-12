
class TestReturnArray12{

	//creating method which returns an array

	static int[] get(){

		return new int[]{99,88,76,94,55};

		}

	public static void main(String[] arg){

		//calling method which returns an array

		int arr[] = get();

		for(int i : arr){
		System.out.println(i);
	             }
        }

}