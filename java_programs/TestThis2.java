class Student{

	int rollno;
	String name;
	float fees;
	String address;
	char batch;

	Student(int rollno,String name,float fees,String address,char batch){

		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
		this.address=address;
		this.batch=batch;

	}

	void display(){

		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("fees="+fees);
		System.out.println("address="+address);
		System.out.println("batch="+batch);
	}

}

class TestThis2{

	public static void main(String[] arg){

		Student s1= new Student(1,"amit",5000f,"kharbi",'A');
		Student s2= new Student(2,"amita",5000f,"nandanvan",'B');
		Student s3= new Student(3,"amitabh",5000f,"telephone exchange sq.",'C');

		s1.display();
		s2.display();
		s3.display();
	}

}
