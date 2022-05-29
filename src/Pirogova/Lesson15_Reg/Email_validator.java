package Pirogova.Lesson15_Reg;

//email-валидатор

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validator {
    public static void main(String[] args) {
        String e = "cat@gmail.com";
        Pattern pat = Pattern.compile("[\s\\d]*\\@\s+\\.\s{2,3}");
        Matcher ma = pat.matcher(e);
        System.out.println(ma.find());
    }
}
