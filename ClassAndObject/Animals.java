package ClassAndObject;

public class Animals {

    public static void main(String[] args){
        Mammals mammalsObj1 = new Mammals();
        System.out.println(mammalsObj1.name);

        Mammals mammalsObj2 = new Mammals("Peacock");

        Birds.sample();
    }

    public static class Birds{
        static void sample(){
            System.out.println("we are in sample method");
        }
    }
}

class Mammals {
    public String name = "cat";

    Mammals(){
        String name;
        System.out.println("Mammals Default Constructor");;
    }

    Mammals(String name){
        System.out.println(name);
    }
}
