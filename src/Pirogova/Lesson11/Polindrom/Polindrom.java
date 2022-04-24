package Pirogova.Lesson11.Polindrom;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Polindrom {
    public static void main(String[] args) {
        FileReader fileIn = null;

        try {fileIn = new FileReader("original words.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
