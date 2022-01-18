interface intf3
{
   public void name();

    default void name1()
    {

    }
}

class impl2 implements intf3
{
    @Override
public void name(){
    System.out.println("interface 1 method override");
}
// no need to override default method of interface
}

class impl3 implements intf3
{
    @Override
    public void name(){
        System.out.println("interface 1 method override");
    }

    //  override default method of interface

    @Override
    public void name1(){
        System.out.println("interface 1 default  method override");
    }
}

public class lambdaFunc3 {
    public static void main(String args[]){

       impl2 obj1=new impl2();
       obj1.name();

        impl3 obj2=new impl3();
        obj2.name();
        obj2.name1();


    }
}
