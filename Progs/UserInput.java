import java.util.*;
public class UserInput {
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please Enter Your Name : ");
        // String name = sc.nextLine();
        // System.out.println("Your Name is "+name);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter First Number:");
            Float num1 = sc.nextFloat();
            System.out.println("Please Enter Second Number:");
            Float num2 = sc.nextFloat();
            System.out.println("Addision is:"+(num1+num2));
        }
    }
}
