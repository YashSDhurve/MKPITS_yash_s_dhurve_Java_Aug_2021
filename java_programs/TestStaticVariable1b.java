 //Test class to show the values of objects

 public class TestStaticVariable1b{

public static void main(String[] arg){

Student s1 = new Student(12,"yash");
Student s2 = new Student(13,"shubh");
Student.college="ghrc";
s1.display();
s2.display();

}

}