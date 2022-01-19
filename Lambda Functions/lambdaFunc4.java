interface intf4
{
    public static void name1()
    {
        System.out.println("static method in interface");
    }
}

class impl4 implements intf4
{

}

public class lambdaFunc4 {
    public static void main(String args[]){
       // impl4 obj=new impl4();
        //obj.name1();      :. not applicable due to static method

        //impl4.name1();  :. not applicable due to static method

        intf4.name1();

    }
}
