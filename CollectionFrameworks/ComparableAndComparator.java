package CollectionFrameworks;

import java.util.*;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Students a1 = new Students(6,"LEO");
        Students a2 = new Students(2,"BRUNO");
        Students a3 = new Students(5,"TOMMY");
        Students a4 = new Students(4,"OGGY");
        Students a5 = new Students(2,"MAXO");


        List<Students> students = new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5));

        /* Using Comparable
        Collections.sort(students); */

        /* Using Comparator Method - 1
        Comparator<Students> studentsComparator = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                //        return this.age > that.age ? 1 : this.age<that.age ? -1:0;
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };

        Collections.sort(students,studentsComparator); */


         /* Using Comparator Method - 2
        Comparator<Students> studentsComparator = ( o1, o2) ->  Integer.compare(o1.getAge(),o2.getAge());

        Collections.sort(students,studentsComparator); */



        /* Using Comparator Method - 3
        Collections.sort(students,new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                //        return this.age > that.age ? 1 : this.age<that.age ? -1:0;
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        }); */

         /* Using Comparator Method - 4 */
        Collections.sort(students,(o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()) );


        System.out.println(students);
    }
}

class Students implements Comparable<Students>{
    private final int age;
    private final String name;

    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    /**
     * Getter Method
     * @return age
     */
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students that) {
//        return this.age > that.age ? 1 : this.age<that.age ? -1:0;
        return Integer.compare(this.age,that.age);
    }
}