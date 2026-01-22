package LambdaExpressions;

interface WithMultipleExpressionInterface{
    int cube(int a);
}

public class WithMultipleExpression {
    public static  void main(String[] args){
        System.out.println("Lambda expression with multiple-expressions");

        //implementing that method
        WithMultipleExpressionInterface method = (int a) -> {
            return (int) Math.pow(a,3);
        };

        //calling that method
        method.cube(3);
    }
}
