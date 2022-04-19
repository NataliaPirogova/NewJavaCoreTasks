package Pirogova.Lesson6_8.Shape;

public class Test {
    public static void main(String[] args) {
        Shape circle1 = new Circle("Red", 2, 24);
        circle1.draw();
        Shape circle2 = new Circle("Blue", 12, 4);
        circle1.equals(circle2);
    }
}
