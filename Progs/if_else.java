import java.util.*;

public class if_else{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number:");
            int num = sc.nextInt();

            if (num % 2 ==0){
                System.out.println("Given number is Even");
            }
            else{
                System.out.println("Given Number is Odd");
            }
        }

        
        // System.out.println("Enter Your age:");
        // int age = sc.nextInt();
        
        // if (age > 18){
        //     System.out.println("Your age is above 18");
        // }
        // else if (age == 18){
        //     System.out.println("Your age is 18");
        // }
        // else{
        //     System.out.println("Your age is less than 18");
        // }

    }
}
