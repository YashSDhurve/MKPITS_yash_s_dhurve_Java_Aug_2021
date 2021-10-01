

class TotalMarks{

	void Student(int s1,int s2,int s3){

		int result= s1+s2+s3;
		System.out.println("total marks obtain="+result);

	}

	 void Student(int s1,int s2,int s3,int s4,int s5){

			int result= s1+s2+s3+s4+s5;
			System.out.println("total marks obtain="+result);

	}

}

class Overld5{

	public static void main(String[] arg){

		TotalMarks t = new TotalMarks();

		t.Student(99,88,77);


		t.Student(99,88,77,66,55);

	}

}

