package Pirogova;
//Посчитать количество букв без учета регистра
//Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.

import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        String string = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String s = "[a-zA-Z]";
        Set<String> set= new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if(String.valueOf(string.charAt(i)).equals(s)){
            set.add(String.valueOf(string.charAt(i)));
        }}

        System.out.println(set);
    }
}

//
//    public static void main(String[] args) {
//        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//        text = text.toLowerCase();
//
//        Map<Character, Integer> map = new TreeMap<>();
//        for(char c: text.toCharArray()){
//            if(c>='a' && c<='z'){
//                map.put(c,map.getOrDefault(c,0)+1);
//            }
//        }
//
//        for (Map.Entry<Character,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }