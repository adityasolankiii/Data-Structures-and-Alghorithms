// import java.util.*;

public class patterns {
   public static void main(String[] args){

       //Scanner sc = new Scanner(System.in);
//       System.out.print("Enter number of Rows : ");
//       int r = sc.nextInt();
//       System.out.print("Enter number of Columns : ");
//       int c = sc.nextInt();

       //1.Pattern - BOX
       /* for(int i = 1;i<=r;i++){
           for(int j=1;j<=c;j++){
               System.out.print("*");
           }
           System.out.println();
       } */

       //2.Pattern - Boundary Rectangle
//       for (int i=1;i<=r;i++){
//           for(int j=1;j<=c;j++){
//               if(i==1 || j==1 || i==r || j==c){
//                   System.out.print("*");
//               }
//               else{
//                   System.out.print(" ");
//               }
//           }
//           System.out.println();
//   }
// ================================================================================================================//
       //3.Pattern - Half Pyramid
//       System.out.print("Enter number : ");
//       int n = sc.nextInt();
//
//       for(int i=1;i<=n;i++){
//           for(int j = 1 ; j<=i; j++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }

       //4.Pattern - Inverted Half Pyramid
//       System.out.print("Enter number : ");
//       int n = sc.nextInt();
//
//       for(int i=n;i>=1;i--){
//           for(int j = 1 ; j<=i; j++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }

       //5.Pattern - Inverted half Pyramid (mirror 180 deg)
//       System.out.print("Enter number : ");
//       int n = sc.nextInt();
//
//       for(int i=1;i<=n;i++){
//           for(int j=1;j<=n-i;j++){
//               System.out.print(" ");
//           }
//           for(int j=1;j<=i;j++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }

//       //5.Pattern - Half Pyramid with numbers
//
//       System.out.print("Enter number : ");
//       int n = sc.nextInt();
//
//       for (int i = 1; i <= n; i++) {
//           for (int j = 1; j <= i; j++) {
//               System.out.print(j);
//           }
//           System.out.println();
//       }

       //6.Pattern - Inverted Half Pyramid with numbers

      /* System.out.print("Enter number : ");
       int n = sc.nextInt();

       for (int i = n; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print(j);
           }
           System.out.println();
       } */

       //7.Pattern - Characters Half Pyramid
      /* System.out.print("Enter number : ");
       int n = sc.nextInt();
       char ch='A';

       for (int i = 1;i<=n;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(ch);
               ch++;
           }
           System.out.println();
       } */








   }
}
