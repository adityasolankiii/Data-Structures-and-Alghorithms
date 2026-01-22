package LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class WithForEachLoop {
    public static void main(String[] args){
        System.out.println("Lambda expression in for-each loop!!");

        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9);

        //printing each element of list by adding 2 in it using for-each loop with lambda expression in it
        list.forEach(x-> System.out.println("Element with 2 addition : "+ (x + 2)));

    }
}
