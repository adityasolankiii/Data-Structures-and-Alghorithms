package Recursion;

import java.util.Scanner;

public class BinaryString {
    public static void printBinaryStrings(int n, int lastPlace, StringBuilder str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //recursion
        printBinaryStrings(n-1,0, str.append("0"));
        str.deleteCharAt(str.length()-1);
        if(lastPlace == 0){
            printBinaryStrings(n-1,1,str.append("1"));
            str.deleteCharAt(str.length()-1);
        }
    }

    public static void printBinaryStrings(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //recursion
        printBinaryStrings(n-1,0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.println("----- Using StringBuilder -----");
        printBinaryStrings(n, 0, new StringBuilder());

        System.out.println("----- Using String -----");
        printBinaryStrings(n, 0, "");
    }
}
