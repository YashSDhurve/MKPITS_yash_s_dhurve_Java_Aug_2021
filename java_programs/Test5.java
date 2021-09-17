//Example of parameterized constructor

class Employee{

int empno;
String name;

Employee(){

System.out.println("default constructor called");

empno=123;
name="bhavesh";
          }

Employee(int en,String n){
System.out.println("parameterized constructor called");

empno=en;
name=n;
      }

void display(){

System.out.println("employee no.="+empno);
System.out.println("employee name:"+name);
              }

       }

 class Test5{

 public static void main(String[] arg)
 {

 Employee E1 = new Employee();
 E1.display();

  Employee E2 = new Employee(262,"Yash");
 E2.display();
 }

 }