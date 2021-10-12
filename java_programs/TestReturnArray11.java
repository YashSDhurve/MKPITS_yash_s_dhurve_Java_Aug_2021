
class TestReturnArray11{

	static int[] marks(){

		return new int[]{99,88,76,94,55};

		}

	public static void main(String[] arg){

		int arr[] = marks();

		for(int val : arr){
		System.out.println("marks = "+val);
	             }
        }

}