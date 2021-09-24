//calling constructor with one parameter  using this keyword

class Student{

int rollno;
String full_name;
char batch;

//creating constructor with no argument:

Student(int rollno){

System.out.println("invoking constructor with no argument: ");

this.rollno=rollno;

}

Student(int rollno,String full_name,char batch){

this(rollno);   //this will call constructor with no argument:

this.full_name=full_name;
this.batch=batch;

}

void display(){

System.out.println("rollno= "+rollno);
System.out.println("full name :"+full_name);
System.out.println("batch :"+batch);
}

}

class TestThis11{

public static void main(String[] arg){

Student s= new Student(262,"Yash Shankarrao Dhurve",'B');

s.display();
}

}


