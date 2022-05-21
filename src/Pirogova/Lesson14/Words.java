package Pirogova.Lesson14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Words {
    public static void main(String[] args) {
        List <String> originWords = new ArrayList<>();
        Collections.addAll(originWords, "dad", "funny", "pop", "strange", "status");

        List<String> filteredWords = originWords.stream()
                .filter(s->s.endsWith(String.valueOf(s.charAt(0)))).collect(Collectors.toList());

        for (String s:filteredWords
             ) {
            System.out.println(s);
        }

    }
}
