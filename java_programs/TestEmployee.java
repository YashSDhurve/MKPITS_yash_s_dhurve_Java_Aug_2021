import mkpits2.Employee;
import java.util.*;

class TestEmployee{

public static void main(String[] arg){

Scanner s= new Scanner(System.in);

System.out.println("enter empno");
int empno=s.nextInt();
System.out.println("enter name");
String name=s.next();
System.out.println("enter basic salary");
int basicsalary=s.nextInt();

Employee E1= new Employee();

E1.insert(empno,name,basicsalary);
E1.calBonus();
E1.display();
}

}