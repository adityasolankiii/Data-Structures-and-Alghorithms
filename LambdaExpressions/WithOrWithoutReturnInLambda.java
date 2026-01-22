package LambdaExpressions;

//without return example
interface MyStringConcatInterface{
    String myStringConcat(String s1,String s2);
}

// with return example
interface MyInterface{
    int myMethod(int x);
}
public class WithOrWithoutReturnInLambda {
    public static  void main(String[] args){
    
        //implementing method of Interface
        MyInterface a = (x) -> x * x;


        int result = a.myMethod(555);
        System.out.println("Square of 555 = "+result);


        //lambda expression without return keyword
        MyStringConcatInterface myStrConcat = (String s1,String s2) -> s1.concat(s2);
        System.out.println("String concat = "+myStrConcat.myStringConcat("Suhel", "Patel"));
    }
}