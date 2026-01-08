public class Abstraction_demo{
    public static void main(String[] args) {
        Horse h =  new Horse();
        h.eats();
        h.walk();
        System.out.println(h.color);
        h.setColor("White");
        System.out.println(h.color);

        Mustang m = new Mustang();
        System.out.println("======================");


        Chicken c = new Chicken();
        c.eats();
        c.walk();

        // Animal a = new Animal();  can not create an instance of an abstract class
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called");
    }

    void eats(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{

    Mustang() {
        System.out.println("Mustang constructor called");
    }
    
}

class Chicken extends Animal{

    void setColor(String color) {
        this.color = color;
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }
}