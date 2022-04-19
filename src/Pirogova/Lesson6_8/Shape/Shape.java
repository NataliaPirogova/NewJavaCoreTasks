package Pirogova.Lesson6_8.Shape;

public abstract class Shape {
    private String color;

    public Shape(){};
    public Shape(String color) {
        this.color=color;
    }

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
