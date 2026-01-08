import java.util.*;

public class Switch {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number : ");
            int a = sc.nextInt();

            switch(a){
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Namaste");
                    break;
                case 3:
                    System.out.println("Kem Cho");
                    break;
                default:
                    System.out.println("You enter wrong number");

            }
        }

    }
}
