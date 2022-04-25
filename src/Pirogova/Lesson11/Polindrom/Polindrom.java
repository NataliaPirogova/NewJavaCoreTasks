package Pirogova.Lesson11.Polindrom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Polindrom {
    public static void main(String[] args) {
        BufferedReader BfR = null;
        File PoliWords = new File("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson11\\Polindrom\\PoliWords.txt");

        try {BfR = new BufferedReader(new FileReader("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson11\\Polindrom\\original words.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
