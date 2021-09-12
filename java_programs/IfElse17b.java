//17-Write a java program to find the eligibility of admission for a professional course based on the following criteria: Go to the editor
//Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and
//Total in all three subject >=190 or Total in Maths and Physics >=140

//Input the marks obtained in Physics :65 Input the marks obtained in Chemistry :51 Input the marks obtained in Mathematics :72
//Total marks of Maths, Physics and Chemistry : 188 Total marks of Maths and Physics : 137 The candidate is not eligible.
//Expected Output :
//The candidate is not eligible for admission.


import java.util.*;

class IfElse17b
  {
   static public void main(String[] arg)
    {
     int maths=72,physics=65,chem=51,total=188;

     if(maths>=65 && physics>=55 && chem>=50 && total>=190 )
     {
	  System.out.println("the student is eligibile for admission");
	 }
else if(maths+physics>=140)
     {
		 System.out.println("the student is eligibile for admission ");
	 }
	 else{
		 System.out.println("the student is not eligibile for admission ");
		 }


    }

   }
