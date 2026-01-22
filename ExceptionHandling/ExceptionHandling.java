package ExceptionHandling;

import java.rmi.server.ExportException;

public class ExceptionHandling {
    public static void main(String[] args){

        try{
            System.out.println(divide(10,2));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Divide by zero is not possible");
        } else {
            return a / b;
        }
    }
}
