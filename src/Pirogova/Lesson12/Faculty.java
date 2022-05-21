package Pirogova.Lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    List<String> facult = new ArrayList<>();

    BufferedReader bfF;

    {
        try {
            bfF = new BufferedReader(new FileReader("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson12\\Faculties.txt"));
            String f;
            while ((f=bfF.readLine())!=null){
                facult.add(f);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//        for (int i = 0; i < facult.size(); i++) {
//        System.out.println(facult.get(i));
//    }
//        System.out.println(facult.size());
}
