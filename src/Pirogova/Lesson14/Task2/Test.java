package Pirogova.Lesson14.Task2;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Collection<People> peopleAll = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        //военнообязанные мужчины
//        Collection<People> conscripted =
//                peopleAll.stream().filter(p->p.getSex()==Sex.MAN).filter(p->p.getAge()<=27&&p.getAge()>=18).collect(Collectors.toList());
//        System.out.println(conscripted);

        //средний возраст мужчин
//        Collection<People> men = peopleAll.stream().filter(p->p.getSex()==Sex.MAN).collect(Collectors.toList());
//        double average = 0;
//        for (People p:
//             men) {
//            average =(double) p.getAge()/men.size()+average;
//        }
//        System.out.println(average);

        //работоспособные, от 18 лет и Ж до 55, а М до 60
//        Collection<People> workingPeople =
//               peopleAll.stream().flatMap(p-> Stream.of(
//                        peopleAll.stream().filter(f->f.getSex()==Sex.WOMEN).filter(f->f.getAge()>=18&&f.getAge()<55),
//                        peopleAll.stream().filter(m->m.getSex()==Sex.MAN).filter(m->m.getAge()>=18&&m.getAge()<60)).
//                        forEach(System.out::println)
//                );
    }
}
