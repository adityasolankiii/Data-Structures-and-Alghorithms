package LambdaExpressions;

interface NoParam{
    void noParam();
}

//Single Param
interface SingleParam{
    void greets(String str);
}

//multiple Param
interface MultipleParam{
    int mul(int a,int b,int c);
}

public class NoParamSingleParamMulParam {
    public static void main(String[] args){
        System.out.println("No-Parameter Example Lambda Expression Example :-");

        NoParam noParam = () -> System.out.println("Hello world");

        //calling noParam method of interface
        noParam.noParam();

        System.out.println("Single-Parameter Example Lambda Expression Example : -");

        SingleParam singleParam = (String str) -> System.out.println(str);

        singleParam.greets("Hello from a Single Parameter!!!");

        System.out.println("Multiple-Parameter Example Lambda Expression Example : -");

        MultipleParam multipleParam = (int a,int b,int c) -> a * b * c;

       int result =  multipleParam.mul(2,3,4);

        System.out.println("Multiplecation of 3 numbers = "+result);
    }

}
