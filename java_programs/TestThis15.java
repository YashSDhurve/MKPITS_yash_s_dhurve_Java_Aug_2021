//Real usage of this() constructor call

//The this() constructor call should be used to reuse the constructor from the constructor.
//It maintains the chain between the constructors i.e. it is used for constructor chaining.
//Let's see the example given below that displays the actual use of this keyword.

//Rule: Call to this() must be the first statement in constructor.

    class Student{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course){
    this.rollno=rollno;
    this.name=name;
    this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
    this.fee=fee;
    this(rollno,name,course);
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
    }
    class TestThis15{
    public static void main(String args[]){
    Student s1=new Student(111,"ankit","java");
    Student s2=new Student(112,"sumit","java",6000f);
    s1.display();
    s2.display();
    }}


    //Test it Now

//Compile Time Error: Call to this must be first statement in constructor

