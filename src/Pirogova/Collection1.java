package Pirogova;

import java.util.HashSet;
import java.util.Set;

//найти макс последовательность чисел. для первого дб 9, для второго дб 4
//[0,3,7,2,5,8,4,6,0,1]
//[100,4,200,1,3,2]
public class Collection1 {
    public static void main(String[] args) {
        Integer[] massive = {100, 4, 200, 1, 3, 2};
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < massive.length; i++) {
//            list.add(massive[i]);
//        }
//        Collections.sort(list);
//        System.out.println(list);
//        int count=1;
//        for (int i = 1; i < list.size(); i++) {
//        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < massive.length; i++) {
            set.add(massive[i]);
        }
        int count =1;
        for (int i = 0; i < massive.length; i++) {
            if (set.contains(massive[i] - 1)) {
                count++;
            }
        }
        System.out.println(set);
    }
}