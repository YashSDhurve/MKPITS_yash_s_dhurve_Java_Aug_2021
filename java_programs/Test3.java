

class Employee{

int empno;
String name;

Employee(){
           empno=262;
	       name="Yash";
          }

   }

class Test3{
public static void main(String[] arg){

Employee emp = new Employee();

System.out.println("employee no="+emp.empno);
System.out.println("employee name:"+emp.name);
}
}

