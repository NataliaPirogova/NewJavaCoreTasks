package Pirogova.Lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
//        String input = "323-90-23";
//        String pattern = "^\\d{3}-\\d{2}-\\d{2}$";
//        Pattern p = Pattern.compile(pattern);
//        Matcher matcher = p.matcher(input);
//        System.out.println(matcher.find());
//
        String input1 = "abbcdeffgllmn";
        String pattern1 = "\\w{2,}";
        Pattern p1 = Pattern.compile(pattern1);
        Matcher m1 = p1.matcher(input1);
//        System.out.println(m1.find());
        while (m1.find()){
            System.out.println(m1.group());
        }




    }
}
