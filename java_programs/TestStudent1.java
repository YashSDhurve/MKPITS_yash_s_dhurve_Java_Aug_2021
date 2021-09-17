//3-Java Program to demonstrate having the main method in
    //another class
    //Creating Student class.


class Student{

             int id;
             String name;

		     }

class TestStudent1{
             static public void main(String[] arg)
             {
             Student s = new Student();

             System.out.println(s.id);
             System.out.println(s.name);
             }

             }


