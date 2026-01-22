package CallByValueAndCallByReference;

public class CallByValue {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        System.out.println("Before swapping, a = "+a+" b = "+b);
        swap(a,b);
        System.out.println("After swapping, a = "+a+" b = "+b);
    }

    public static void swap(int a, int b){
        System.out.println("Before swapping inside, a = "+a+" b = "+b);
        int c = a;
        a=b;
        b=c;
        System.out.println("After swapping inside, a = "+a+" b = "+b);
    }
}


