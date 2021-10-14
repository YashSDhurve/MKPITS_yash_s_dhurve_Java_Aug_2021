	import java.util.*;

class Student{
	int rollno;
	String name;
	int age;

	Student(int rollno,String name,int age){

		this.rollno=rollno;
		this.name=name;
		this.age=age;
		}
	}

class ArrayListEx8{
	public static void main(String[] arg){
		Student s1=new Student(1,"Amit",21);
		Student s2=new Student(2,"Amita",21);
		Student s3=new Student(3,"Amitabh",22);

		ArrayList<Student> al=new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);

		Iterator itr=al.iterator();

       while(itr.hasNext()){
		   Student stud=(Student)itr.next();
		System.out.println(stud.rollno+" "+stud.name+" "+stud.age);
	}


		}
	}