interface Drawable {
    public abstract void draw();
}

abstract class Shape {
    public double res=0;
    public abstract double area();
    public void printArea() {
        System.out.println("면적은 " + res + "이다.");
    }
}

class Rectangle extends Shape implements Drawable {
    public int w = 10;
    public int h = 10;
    @Override
    public double area() {
        res=w*h;
        return res;
    }
    public void draw() {
        System.out.println("사각형을 그리다.");
    }
}

public class Interface1{
    public static void main (String[] args) {
        Rectangle ref=null;
        ref=new Rectangle();
        ref.area();in
        ref.printArea();
        ref.draw();
    }
}