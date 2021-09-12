//2- wap to accept empno , empname and salary and then print hra ,da, and total salary.

import java.util.*;

class Empdetails
{
 static public void main(String[] arg)
 {
   int empno;
   String empname;
   float salary;
   float hra;
   float da;
   float basic_salary;
   float total_salary;
   Scanner s = new Scanner(System.in);
   System.out.println("enter employee no.");
   empno=s.nextInt();
   System.out.println("enter employee name");
   empname=s.next();
   System.out.println("enter basic salary");
   basic_salary=s.nextFloat();
   hra=(float) (basic_salary) * (0.40f);
   System.out.println("hra="+hra);
   da= (float)(basic_salary) * (0.17f);
   System.out.println("da="+da);

      total_salary=(basic_salary+hra+da);
      System.out.println("total salary="+total_salary);




   }

   }