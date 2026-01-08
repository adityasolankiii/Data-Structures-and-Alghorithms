class MyNewThr1 extends Thread {
    public MyNewThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 16;

        while (true) {
            System.out.println("Thank you : 1");
        }
    }
}

class MyNewThr2 extends Thread {
    public MyNewThr2(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 1603;

        while (true) {
            System.out.println("Thank you : 2");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1("Aditya");
        MyNewThr2 t2 = new MyNewThr2("Solanki");

        t1.start();
        
        try {
            t1.join();    
        } catch (Exception e) {
            System.out.println(e);
        }
        
        t2.start();

    }
}
