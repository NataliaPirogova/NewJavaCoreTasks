package Pirogova.Lesson15_Reg;

import java.util.regex.Pattern;

//Написать регулярное выражение для IPV4
//от 0.0.0.0 до 255.255.255.255.
//255.255.255.16
public class IPV4 {
    public static void main(String[] args) {
        String ipv4 = "255.255.255.16";
//        Pattern p = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");  //формат ipv4 в принципе
//        Matcher m = p.matcher(ipv4);
//        System.out.println(m.matches());
//        while (m.matches()) {
//            Pattern p1 = Pattern.compile("\\D");
//            String[] num = p1.split(ipv4);
//            for (String i :
//                    num) {
//                System.out.println(i);
//                int number = Integer.parseInt(i);
//                if (number >= 0 && number <= 255) {
//                    continue;
//                } else {
//                    System.out.println("Неверный формат записи IPV4");
//                    break;
//                }
//            }
//            break;
//        }

        Pattern p2 = Pattern.compile("");

    }
}
