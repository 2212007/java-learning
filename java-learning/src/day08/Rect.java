package day08;

public class Rect extends Shape {
    public double length;
    public double width;
    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return length * width;
    }
}
