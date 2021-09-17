//It calls a default constructor if there is no constructor
//available in the class. In such case, Java compiler provides a default constructor by default.

class Employee{
               int empno;
                void insert(int eno){
                       empno=eno;
                       }
              }

class Test1{
   public static void main(String[] arg)
 {
   Employee emp = new Employee();

   emp.insert(100);
   }
         }
