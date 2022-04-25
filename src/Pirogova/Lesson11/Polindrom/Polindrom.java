package Pirogova.Lesson11.Polindrom;

import java.io.*;

public class Polindrom {
    public static void main(String[] args) {
       File PoliWords = new File("D:/NewJavaCoreTasks/src/Pirogova/Lesson11/Polindrom/poliWords.txt");

        try (BufferedReader BfR = new BufferedReader(new FileReader("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson11\\Polindrom\\original words.txt"));
             BufferedWriter BfW = new BufferedWriter(new FileWriter("D:/NewJavaCoreTasks/src/Pirogova/Lesson11/Polindrom/poliWords.txt"))){
        int c;
            while ((c=BfR.read())!=-1){

        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
