package Pirogova.Lesson11.Polindrom;

import java.io.*;

public class NewPolindrom {
    public static void main(String[] args) {
        File file = new File("\\OriginText.txt");
        try(BufferedReader BfR = new BufferedReader(new FileReader(file))) {
            if (file.createNewFile()){
                System.out.println("Файл создан");
            }

            String line = BfR.readLine();
            StringBuilder SB = new StringBuilder();
            while (line != null){
                SB.append(line).append("\n");
                line = BfR.readLine();
            }

            String[] words = SB.toString().split("\n");
            for (String s:words) {
                if(s.equalsIgnoreCase(new StringBuilder().append(s).reverse().toString())){
                    try(BufferedWriter BfW = new BufferedWriter(new FileWriter(".\\PoliWords.txt", true))) {
                        BfW.write(s+"\n");
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
