package Pirogova.Lesson6_8.Shape;

public class Circle extends Shape{
    private int a;
    private int b;

    public Circle(String color, int a, int b){
        super(color);
        this.a=a;
        this.b=b;
    }
    @Override
    public void draw() {
        System.out.println("Цвет: "+this.getColor()+", координаты: "+a+", "+b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
