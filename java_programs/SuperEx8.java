
//creating a parent class person

class person
{
    String name;
    String address;
     person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
     void  displaydata()
    {
        System.out.println("name = " +name + "  address= "+ address);
    }
}
//creating a derieved class student
class student extends  person
{
    int rno;
    int marks;
     student(int rno,int marks,String name,String address)
    {
        super(name,address); // calling base class constructor with 2 par.
        this.rno=rno;
        this.marks=marks;
    }
     void displaydata()
    {
        super.displaydata();
        System.out.println("rno = " +rno + "  marks = "+ marks);
    }
}

public class SuperEx8 {
    public static void main(String[] args) {
        java.util.Scanner scan=new java.util.Scanner(System.in);
        System.out.println("enter  student details as rno,name,address,marks");
    int rno=scan.nextInt();
    String name=scan.next();
    String address=scan.next();
    int marks=scan.nextInt();

        student s=new student(rno,marks,name,address); // creating child class object

        s.displaydata();


    }
}
