import java.util.*;
class StringClass {

    public static void main(String[] args) {
        
        String str1 = new String("Hello");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String str2 = sc.nextLine();

        System.out.println(str1+" "+str2);
        System.out.println(str2.length());
        System.out.print(str1.charAt(2));
    }
}