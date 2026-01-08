package CollectionFrameworks;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<String> names = new ArrayList<>(Arrays.asList("Aditya","Mihir", "Sunny", "Ravi"));

        Stream<Integer> numsStream = nums.stream();

        Integer numsReduceStream = numsStream.reduce(0,(acc, el)-> acc + el);
        Integer namesReduceStream = names.stream().reduce(0,(len, el)-> len + el.length(),Integer::sum);
        String namesConcateReduceStream = names.stream().reduce("",(len, el)-> len + el);
        String namesConcateReduceParellelStream = names.parallelStream().reduce("",(len, el)-> len + el);


        System.out.println(numsReduceStream);
        System.out.println(namesReduceStream);
        System.out.println(namesConcateReduceStream);
        System.out.println(namesConcateReduceParellelStream);
    }
}
