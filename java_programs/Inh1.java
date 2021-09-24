//eg : create a parent class person having fields name and address then create a inherited class student having new fields rno and marks

//creating parent class person

class Person{
            String name;
            String address;
            }

//creating child/extended/derived class Student

class Student extends Person{
                            int rno;
                            int marks;
                            }

void display(){

	 System.out.println("name : "+name);
	 System.out.println("address : "+address);
	 System.out.println("roll no = "+rno);
 System.out.println("marks = "+marks);
}



 class Inh1{

 public static void main(String[] arg ){

 Student s=new Student();

 s.name="Yash Dhurve";
  s.address="kharbi";
  s.rno=262;
  s.marks=88;

  s.display();


 }

 }




