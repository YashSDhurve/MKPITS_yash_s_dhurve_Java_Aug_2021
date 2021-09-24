//Calling parameterized constructor from default constructor:

class Student{

int rollno;
String full_name;
char batch;

Student(){

this(262,"Yash Shankarrao Dhurve",'B');  //Calling parameterized constructor from default constructor:

System.out.println("Calling parameterized constructor from default constructor:");

}

Student(int rollno,String full_name,char batch){

this.rollno=rollno;
this.full_name=full_name;
this.batch=batch;

}

void display(){

System.out.println("rollno= "+rollno);
System.out.println("full name :"+full_name);
System.out.println("batch :"+batch);
}

}

class TestThis12{

public static void main(String[] arg){

Student s= new Student();

s.display();
}

}


