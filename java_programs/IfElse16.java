//16-Write a java program to find the eligibility of admission for a professional course based on the following criteria: Go to the editor
//Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and
//Total in all three subject >=190 or Total in Maths and Physics >=140

import java.util.*;

class IfElse16
  {
   static public void main(String[] arg)
    {
     int maths,physics,chem,total;

     Scanner s = new Scanner(System.in);
     System.out.println("enter marks of maths,physics and chemistry");
     maths = s.nextInt();
     physics = s.nextInt();
     chem = s.nextInt();

    total=maths+physics+chem;
    System.out.println("total marks="+total);


     if(maths>=65 && physics>=55 && chem>=50 && total>=190 )
     {
	  System.out.println("the student is eligibile to admission for a professional course");
	 }
else if(maths+physics>=140)
     {
		 System.out.println("the student is eligibile to admission for a professional course");
	 }
	 else{
		 System.out.println("the student is not eligibile to admission for a professional course");
		 }


    }

   }
