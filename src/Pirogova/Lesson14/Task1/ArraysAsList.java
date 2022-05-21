package Pirogova.Lesson14.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArraysAsList {
    public static void main(String[] args) throws Exception {
        List<String> origin = Arrays.asList("a1","a2","a3","a1");

//        System.out.println(origin.stream().filter(s -> s.equals("a1")).count()); //количество элементов "a1"
//
//        Optional<String> first = origin.stream().findFirst(); //первый элемент
//        System.out.println(first.orElse("0"));
//
//        Optional<String> last = Optional.ofNullable(origin.get(origin.size()-1));  //???
//        System.out.println(last.orElse("empty"));

//        if(origin.contains("a3")){
//            System.out.println(origin.contains("a3"));
//        }
//        else{
//            throw new Exception();
//        }
//
//        System.out.println(origin.get(3));

//        origin.stream().skip(1).limit(2).forEach(System.out::println);



    }
}
