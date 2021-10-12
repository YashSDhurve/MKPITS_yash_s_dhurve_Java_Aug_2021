//Example to instantiate Multidimensional Array in Java



class TestJaggedArray20{

	public static void main(String[] arg){

 //declaring a 2D array with odd columns

		int arr[][]=new int[3][];    //arr[row][col]

		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[5];

		java.util.Scanner scan=new java.util.Scanner(System.in);

		int count=0;

			for(int i=0;i<arr.length;i++){
					for(int j=0;j<arr[i].length;j++){

	                     arr[i][j]=count++;
						}
				}

				//displaying

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+ " ");

				}
				System.out.println();
				}


		}}