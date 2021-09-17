//4-1) Object and Class Example: Initialization through reference

//Initializing an object means storing data into the object.
//Let's see a simple example where we are going to initialize the object through a reference variable.


class Student{

             int id;
             String name;

		     }

class TestStudent3{
             static public void main(String[] arg)
             {
             Student s1 = new Student();
             s1.id=262;
             s1.name="Yash";
             Student s2 = new Student();
			 s2.id=255;
             s2.name="Varun";


             System.out.println(s1.id+ "" +s1.name);
             System.out.println(s2.id+ "" +s2.name);

             }

             }


