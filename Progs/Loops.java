import java.util.*;

public class Loops {
    public static void main(String[] args){
//        for (int i = 1; i<=10;i++){
//            System.out.println("Hello World!");
//        }
//        int i = 0;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//        int i =0;
//        do{
//            System.out.print(i+" ");
//            i++;
//        }while (i<=10);


        //----------Sum of first n number-----------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println("Sum is : "+sum);


        // ------------------Table of given number-------------------------

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number for print table: ");
            int n = sc.nextInt();
            for (int i = 1;i<=10;i++){
                System.out.println(n+"X"+i+"="+n*i);
            }
        }
    }
}
