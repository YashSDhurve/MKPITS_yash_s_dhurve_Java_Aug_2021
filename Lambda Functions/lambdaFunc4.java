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
        intf4.name1();

    }
}
