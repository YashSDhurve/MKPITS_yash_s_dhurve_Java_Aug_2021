class th1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread " + i + " " + getName());
        }
    }
}

    class ThreadEx1{
    public static void main(String[] arg) {
        th1 ob1 = new th1();
        ob1.start();

    }
    }