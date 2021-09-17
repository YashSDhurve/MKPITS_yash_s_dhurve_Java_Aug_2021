class Student{

	int rollno;
	String name;
	float fees;
	String address;

	Student(int rollno,String name,float fees,String address){

		rollno=rollno;
		name=name;
		fees=fees;
		address=address;
	}

	void display(){

		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("fees="+fees);
		System.out.println("address="+address);
	}

}

class TestThis1{

	public static void main(String[] arg){

		Student s1= new Student(1,"amit",5000f,"kharbi");
		Student s2= new Student(2,"amita",5000f,"nandanvan");
		Student s3= new Student(3,"amitabh",5000f,"telephone exchange sq.");

		s1.display();
		s2.display();
		s3.display();
	}

}
