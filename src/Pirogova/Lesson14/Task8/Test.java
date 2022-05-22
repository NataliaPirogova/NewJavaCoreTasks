package Pirogova.Lesson14.Task8;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> num = Arrays.asList(1,2,3,4,2);

        System.out.println(num.stream().reduce((x,y)->x+y).orElse(0));

        System.out.println(num.stream().reduce(Integer::max).orElse(-1));

        System.out.println(num.stream().filter(p->p%2==1).reduce(Integer::sum).orElse(0));
    }

}
