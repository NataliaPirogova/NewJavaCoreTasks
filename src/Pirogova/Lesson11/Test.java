package Pirogova.Lesson11;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        String nameDir = "/NewJavaCoreTasks/src/Pirogova/Lesson11/Polindrom";
        File a = new File(nameDir);
        a.mkdirs();
    }
}
