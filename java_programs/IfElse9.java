//9 - wap to accept salary from the user then calculate bonus =1000 if salary is greater than 10000 ,
//bonus =500 if salary is greater than 5000 and less than 10000 , bonus =100 if salary is less than 5000.

import java.util.*;

class IfElse9
  {
   static public void main(String[] arg)
    {
     int salary,bonus;

     Scanner s = new Scanner(System.in);
     System.out.println("enter salary");
     salary= s.nextInt();

     if(salary >= 10000 ){
	 		System.out.println("bonus=1000");
	 	}
	 	else if(salary >= 5000 && salary < 10000) {
	 	System.out.println("bonus=500");
	 	}
	  if(salary<5000 ) {
	 	System.out.println("bonus=100");
	 	}

    }

   }
