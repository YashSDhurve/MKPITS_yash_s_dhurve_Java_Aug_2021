//example of employee class with constructor and method

class Employee{

int empno;
String name;

     Employee(){
     empno=123;
     name="Yash";
               }

     void display(){
                    System.out.println(empno+""+name);
                    }

		      }

class Test4{
public static void main(String[] arg){
                                      Employee E = new Employee();
                                      E.display();
                                      }
           }



