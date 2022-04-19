package Pirogova.Lesson6_8.Shape;

public class Rectangle extends Shape{
    private int a;
    private int b;
    private int c;
    private int d;

    public Rectangle(){};

    public Rectangle(String color, int a, int b, int c, int d){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    @Override
    public void draw() {
        System.out.println("Цвет: "+this.getColor()+",  координаты: "+a+", "+b+", "+c+", "+d);
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
