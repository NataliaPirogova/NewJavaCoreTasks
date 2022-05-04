package Pirogova.Lesson9;

public class StringTest {
    public static void main(String[] args) {
        String st1 = "Today is Tuesday";
        //задание 1
//        System.out.println(st1.indexOf('d'));
//        System.out.println(st1.lastIndexOf('d'));
        System.out.println(st1.substring(st1.indexOf('d'),st1.lastIndexOf('d')));
        //задание 2
        System.out.println(st1);
        StringBuilder SB = new StringBuilder();
        SB.append("заменяем все '");
        SB.append(st1.charAt(3));
        SB.append("' на '");
        SB.append(st1.charAt(0));
        SB.append("'");
        System.out.println(SB);
        System.out.println(st1.replace('a','T'));
    }
}
