package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class WithOrWithoutLambdaExpression {
    public static void main(String[] args){
        System.out.println("Example with or without lambda expression");

        //ArrayList
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //using lambda-expression in forEach loop or method
        System.out.println("Using lambda-expression in forEach loop or method");

        list.forEach(n -> System.out.println("Element = "+n));

        //without lambda-expression using Inhanced for loop
        System.out.println("Without lambda-expression using Inhanced for loop");



        for(int ele:list){
            System.out.println("Element = "+ele);
        }


    }
}
