//Real usage of this() constructor call

//The this() constructor call should be used to reuse the constructor from the constructor.
//It maintains the chain between the constructors i.e. it is used for constructor chaining.
//Let's see the example given below that displays the actual use of this keyword.

class Student {

	int rollno;
	String name,course;
	float fees;

	Student(int rollno,String name,String course){

		this.rollno=rollno;
		this.name=name;
		this.course=course;

	}

	Student(int rollno,String name,String course,float fees){

		this(rollno,name,course);

		this.fees=fees;

	}

	void display(){

		System.out.println("roll no="+rollno);
		System.out.println("name:"+name);
		System.out.println("course:"+course);
		System.out.println("fees"+fees);
}

}

class TestThis14{

	public static void main(String[] arg){

		Student s1= new Student(1,"abhay","java",1000f);
		Student s2= new Student(2,"abhaya","java",1000f);
		Student s3= new Student(3,"abhaynsh","java",1000f);

		s1.display();
		s2.display();
		s3.display();

	}

}