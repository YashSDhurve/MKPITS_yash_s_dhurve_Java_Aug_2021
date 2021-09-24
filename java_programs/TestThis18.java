//6) this keyword can be used to return current class instance

    class A{
    A getA(){
    return this;
    }
    void msg(){

		System.out.println("hello java");

		}
    }
    class TestThis18{

    public static void main(String args[]){

    new A().getA().msg();

    }

    }
