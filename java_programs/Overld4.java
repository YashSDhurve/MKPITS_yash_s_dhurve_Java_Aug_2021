

class TotalMarks{

	static int Student(int s1,int s2,int s3){

		return s1+s2+s3;

	}

	static int Student(int s1,int s2,int s3,int s4,int s5){

			return s1+s2+s3+s4+s5;

	}

}

class Overld4{

	public static void main(String[] arg){

		TotalMarks t = new TotalMarks();

		int result=t.Student(99,88,77);
		System.out.println("total marks obtain="+result);

		result=t.Student(99,88,77,66,55);
		System.out.println("total marks obtain="+result);
	}

}

