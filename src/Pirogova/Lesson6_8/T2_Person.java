package Pirogova.Lesson6_8;

public class T2_Person {
String fullName;
int age;

public void move(){
    System.out.println(this.fullName + " идет");
}

public void talk(){
    System.out.println(this.fullName + " говорит");
}

public T2_Person(){
}

public T2_Person (String fullName, int age){
    this.fullName = fullName;
    this.age = age;
}

public void displayInfo(){
    System.out.println("Имя: " + this.fullName + ", возраст " + this.age);
}
}
