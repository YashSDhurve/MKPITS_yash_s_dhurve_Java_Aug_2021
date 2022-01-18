interface intf2
{
    void dis();
}

/*class impl2 implements intf2
{    @Override
public void dis(){
    System.out.println("Welcome");
}
}*/

public class lambdaFunc2 {
    public static void main(String args[]){

        intf1 obj1 = ()->System.out.println("Welcome to Lambda functions");
       obj1.dis();

    }
}
