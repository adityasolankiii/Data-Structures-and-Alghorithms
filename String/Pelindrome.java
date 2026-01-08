
import java.util.Scanner;

class Pelindrome{

    public static Boolean isPelindrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word");
        String str = sc.next();
        if(isPelindrome(str)){
            System.out.println("Given word is Pelindrome");
        } else {
            System.out.println("Given word is not a Pelindrome");
        }
    }
}