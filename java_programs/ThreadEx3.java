class thr1 implements Runnable{
    Thread t1;
    thr1(){
        t1=new Thread(this);
        t1.start();
    }

    public void run(){
        System.out.println("hello from yash");
    }

}

public class ThreadEx3 {
    public static void main(String[] arg){

        thr1 ob=new thr1();
        thr1 ob1=new thr1();


    }
}
