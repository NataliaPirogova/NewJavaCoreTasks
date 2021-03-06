package Pirogova.Lesson15_Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
    {
        public static void main(String[] args) {
            //* дата с високосным годом 2000-02-29 валидная, а вот эта 2001-02-29 невалидная
            String date = "2001-2-29";
            Pattern pattern = Pattern.compile("([0-2][0-9]{3})-(0[0-9]|1[0-2])-\\d{2}");
            Matcher m = pattern.matcher(date);
            while (m.find()){
                System.out.println(m.matches());

                Pattern p29 = Pattern.compile("\\d{4}-02-29");
                Matcher m29 = p29.matcher(date);
                if (m29.matches()) {
                    String year = date.substring(0, 4);
                    int year1 = Integer.parseInt(year);
                //    System.out.println(year1);
                    if (year1 % 4 == 0) {
                        System.out.println("Год високосный, все ок");
                    } else {
                        System.out.println("Год не високосный, не может быть 29 февраля");
                    }
                }
            }

        }
        }



        //Написать регулярное выражение для IPV4
//255.255.255.16
//————————————
//email-валидатор
//————————————--


//(.)(?=.*\1)