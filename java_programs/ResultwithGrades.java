//wap to accept 3 subject marks and calculate total , per and grade

import java.util.*;

class ResultwithGrades
{
static public void main(String[] arg)
{
    int s1,s2,s3,total;
    float per ;
    Scanner s = new Scanner(System.in);
    System.out.println("enter 3 subject marks");
    s1=s.nextInt();
    s2=s.nextInt();
    s3=s.nextInt();
    total=s1+s2+s3;
    System.out.println("total marks="+total);
    per=(float) (total/300.0f) * 100.0f;
    System.out.println("percentage="+per);

    if(per>=75)
    {
    System.out.println("grade=1st ");
    }
    else if(per>=45 && per<75)
    {
    System.out.println("grade=2nd ");
    }
    else
        {
        System.out.println("grade=fail ");
    }









}
}