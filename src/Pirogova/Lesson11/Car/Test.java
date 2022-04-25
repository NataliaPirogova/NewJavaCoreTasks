package Pirogova.Lesson11.Car;

import java.io.*;

public class Test {
    public static void main(String[] args) {

        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson11\\Car\\carBefore.txt"))){
            Car car1 =new Car("Volvo",200,29000);
            OOS.writeObject(car1);
            System.out.println(car1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("D:\\NewJavaCoreTasks\\src\\Pirogova\\Lesson11\\Car\\carBefore.txt"))){
            Car car2 = (Car)OIS.readObject();
            System.out.println(car2.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
