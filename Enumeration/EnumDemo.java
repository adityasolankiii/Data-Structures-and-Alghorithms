package Enumeration;

public class EnumDemo {

    enum Animals{
        Mammals,
        Birds,
        Reptile,
        Fish
    }

    public static void main(String[] args) {
        Fruits fruitVar = Fruits.Mango;
        System.out.println(fruitVar);


        //enum with switch case
        switch(fruitVar){
            case Apple:
                System.out.println("Case Mammals");
                break;
            case Mango:
                System.out.println("Cash Fish");
                break;
            default:
                System.out.println("This is default case");
        }

        //enum with loop
        for(Animals animalVar : Animals.values()){
            System.out.println(animalVar);
        }
    }
}

enum Fruits{
    Apple,
    Mango,
}