package Pirogova.Lesson9;

public class StringTest {
    public static void main(String[] args) {
        String st1 = "Today is Tuesday";
        //задание 1
        System.out.println(st1.indexOf('d'));
        System.out.println(st1.lastIndexOf('d'));
        System.out.println(st1.substring(2,13));
        //задание 2
        System.out.println(st1);
        System.out.println("заменяем все '"+st1.charAt(3)+"' на "+st1.charAt(0));
        System.out.println(st1.replace('a','T'));
        //задание 3
        String[]mass = new String[5];
        mass[0]="cat";
        mass[1]="moon";
        mass[2]="Sun";
        mass[3]="holiday";
        mass[4]="sister";
        String[]polindrom = new String[5];
        int i = 0;
        for (String element:
             mass) {
            StringBuilder SB = new StringBuilder(element);
            SB.reverse();
            System.out.println(element.concat(SB.toString()));
            polindrom[i]= element.concat(SB.toString());
            i++;
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(polindrom[j]);
        }
    }
}
