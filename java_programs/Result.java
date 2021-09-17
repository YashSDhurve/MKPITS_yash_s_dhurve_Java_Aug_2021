//create a package mkpits1 and in it create a class Result having
// methods to calculate total, percentage and grade.

package mkpits1;

public class Result{

int phy,chem,maths,total;

float per;

String grade;
 
public int calTotal(int s1,int s2,int s3){

phy=s1;
chem=s2;
maths=s3;


total=phy+chem+maths;

return total;
}

public float calPer(){

per=(float) (total/300.0f) * 100.0f;

return per;

}

public String ShowGrade(){

if(per>=70)
{grade="Distinction";}

else if(per>=45 && per<70)
{grade="First class";}

else{
grade="Fail";
}
return grade;

}

}

