package LambdaExpressions;

public class LambdaExpressionWithThread {
    public static void main(String[] args){
        System.out.println("Lambda Expression with Threads");

        //Implementing run method of thread of Runnable interface
        Runnable runMethod = ()-> {
            System.out.println(Thread.currentThread().getName() + " is running!!!!");
        };


        Thread t1 = new Thread(runMethod);
        Thread t2 = new Thread(runMethod);

        t1.start();
        t2.start();


    }
}
