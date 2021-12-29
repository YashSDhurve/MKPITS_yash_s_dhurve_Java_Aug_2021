class thr2 implements Runnable{
    int num1=1;
    Thread t1;
    thr2(){
        t1=new Thread(this);
        t1.start();
    }

    public void run(){
        if(num1%2==0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    }

public class ThreadEx4 {
    public static void main(String[] arg){

        thr2 ob=new thr2();
        thr2 ob1=new thr2();


    }
}
