//Example to instantiate Multidimensional Array in Java

import java.util.*;

class TestMultiDimensionArray17{

	public static void main(String[] arg){

		int[][] arr=new int[3][3];

		Scanner scan=new Scanner(System.in);

		for(int i=0;i<3;i++){

			for(int j=0;j<3;j++){

				System.out.println("Enter number");
				arr[i][j]=scan.nextInt();

				}}

		//displaying

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+ " ");

				}
				System.out.println();
				}


		}}