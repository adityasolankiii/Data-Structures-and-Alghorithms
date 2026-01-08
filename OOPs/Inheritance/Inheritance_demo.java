package OOPs.Inheritance;

public class Inheritance_demo{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.color = "Grey";
        System.err.println(shark.color);
    }
}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breaths");
    }
}

//Derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}