package OOPs.Basic_OOPS;

public class Oops {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor()+" "+p1.getTip());
        System.out.println("============================");
        // p1.color="red";
        // System.out.println(p1.color);

        Student s1 = new Student("Aditya");
        s1.roll = 2;
        s1.marks[0]=100;
        s1.marks[1]=95;
        s1.marks[2]=90;

        Student s2 = new Student(s1);
        s1.marks[2]=100;
        
        System.out.println(s2.name+" "+s2.roll);

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}

class Student{
    String name;
    int roll;
    int marks[];


    Student(String name){
        marks = new int[3];
        this.name=name;
    }

    //There are Three types of constructor
    //1.Parameterized Constructors
    //2.Non-Parameterized Constructor
    //3.Copy Constructor
 
    //example of copy constructor

    //1.Shallow Copy
    // Student(Student stu){
    //     marks = new int[3];
    //     this.name = stu.name;
    //     this.roll =stu.roll;
    //     this.marks = stu.marks;
    // }

    //2.Deep Copy
     Student(Student stu){
        marks = new int[3];
        this.name = stu.name;
        this.roll =stu.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=stu.marks[i];
        }
     }
}