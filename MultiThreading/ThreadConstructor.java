
class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        System.out.println("Thank you");
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Aditya");
        MyThr t2 = new MyThr("Solanki");

        t1.start();
        t2.start();

        System.out.println("The ID of the Thread is : " + t1.getId());
        System.out.println("The Name of the Thread is : " + t1.getName());
        
        System.out.println("The ID of the Thread is : " + t2.getId());
        System.out.println("The Name of the Thread is : " + t2.getName());
    }
}
