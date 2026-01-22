package CallByValueAndCallByReference;

public class CallByReference {
    public static void main(String[] args) {
        Change a = new Change(30);
        Change b = new Change(40);

        System.out.println("Before swapping inside, a = "+a.a+" b = "+b.a);
        swap(a,b);
        System.out.println("After swapping inside, a = "+a.a+" b = "+b.a);
    }

    public static void swap(Change a, Change b){
        System.out.println("Before swapping inside, a = "+a.a+" b = "+b.a);

        Change c = new Change(a.a);
        a.a = b.a;
        b.a = c.a;

        System.out.println("After swapping inside, a = "+a.a+" b = "+b.a);
    }
}

class Change{
    public int a;
    public Change(int a){
        this.a = a;
    }
}