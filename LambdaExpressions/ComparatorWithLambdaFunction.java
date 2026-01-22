package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    int salary;
    String name;

    public Employee(String name,int salary){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name : " + name +  " Salary : "+salary;
    }
}

public class ComparatorWithLambdaFunction {
    public static void main(String[] args){

        //creating objects of Employee
        Employee em1 = new Employee("Suhel",30000);
        Employee em2 = new Employee("Abdul",35000);
        Employee em3 = new Employee("Aditya", 29000);
        Employee em4 = new Employee("Pranav",28550);

        //collections of list of employee
        List<Employee> empList = Arrays.asList(em1,em2,em3,em4);

        System.out.println("Before Sorting : ");
        //before sorting emp
        for(Employee e:empList){
            System.out.println(e.toString());
        }

        //Comparator to sort it by increasing order in salary
        Comparator comparator = (Object obj1,Object obj2) ->{
          Employee e1 = (Employee) obj1;
          Employee e2 = (Employee) obj2;

          //sorting logic
          if(e1.salary > e2.salary) return -1;
          if(e1.salary < e2.salary) return 1;
          return 0;
        };

        Collections.sort(empList,comparator);

        System.out.println("After Sorting : ");
        //After sorting emp
        for(Employee e:empList){
            System.out.println( e.toString());
        }
    }
}
