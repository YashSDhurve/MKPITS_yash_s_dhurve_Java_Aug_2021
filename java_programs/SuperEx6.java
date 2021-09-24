
class Person{
    String name;
    String address;
     void getdata(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
     void  displaydata()
    {
        System.out.println("name = " +name);

        System.out.println("address= "+ address);
    }
}

class Student extends  Person{
    int rno;
    int marks;
    public void getdata(int rno,int marks,String name,String address)
    {
        getdata(name,address);
        this.rno=rno;
        this.marks=marks;
    }
     void displaydata()
    {
        super.displaydata();

        System.out.println("rno = " +rno);

          System.out.println( "marks = "+ marks);
    }
}

public class SuperEx6 {

    public static void main(String[] args) {

        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.println("enter  student details as rno,name,address,marks");

    int rno=s.nextInt();
    String name=s.next();
    String address=s.next();
    int marks=s.nextInt();

        Student std=new Student();

        std.getdata(rno,marks,name,address);
        std.displaydata();


    }
}
