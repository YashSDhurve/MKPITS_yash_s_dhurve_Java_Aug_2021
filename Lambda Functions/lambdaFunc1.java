interface intf1
{
    void dis();
}

class impl1 implements intf1
{    @Override
    public void dis(){
        System.out.println("Welcome");
    }
}

public class lambdaFunc1 {
    public static void main(String args[]){
        impl1 obj=new impl1();
        obj.dis();

        // we can also write like this
        intf1 obj1=new impl1();
        obj1.dis();

    }
}
