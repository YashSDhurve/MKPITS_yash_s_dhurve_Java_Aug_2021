    //Java Program to demonstrate the way of passing an array
    //to method.


class TestArray9{
	public static void main(String[] arg){
		//int a[]={12,23,3,4,55};

		min(new int[]{12,23,3,4,55});
		}

//creating method min with parameter as array

static void min(int arr[]){
	int min = arr[0];

	for(int i=1;i<arr.length;i++){

	if( min > arr[i])
	        min=arr[i];

	}
	System.out.println(min);
}
}