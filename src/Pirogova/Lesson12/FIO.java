package Pirogova.Lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FIO {
    public List<String> Fio = new ArrayList<>();

    BufferedReader bfS;

    {
        try {
            bfS = new BufferedReader(new FileReader("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson12\\Students.txt"));
            String s;
            while ((s=bfS.readLine())!=null){
                Fio.add(s);}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//        for (int i = 0; i < 10; i++) {
//        System.out.println(Fio.get(i));
//    }
//        System.out.println(Fio.size());
}
