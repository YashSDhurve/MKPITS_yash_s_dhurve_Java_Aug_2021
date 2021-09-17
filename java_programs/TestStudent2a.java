//4-1) Object and Class Example: Initialization through reference

//Initializing an object means storing data into the object.
//Let's see a simple example where we are going to initialize the object through a reference variable.


class Student{

             int id;
             String name;

		     }

class TestStudent2a{
             static public void main(String[] arg)
             {
             Student s = new Student();
             s.id=262;
             s.name="Yash";

             System.out.println("student id="+s.id);
             System.out.println("student name: "+s.name);
             }

             }


