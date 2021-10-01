class Student{

	void getData(String name){

		System.out.println("Student name is "+name);

	}

	void getData(String name,String address){

		getData("Yash");

			System.out.println("Student address is "+address);

	}

}

class Overld12{

	public static void main(String[] arg){

		Student s = new Student();

		s.getData("Yash","kharbi");

	}

}