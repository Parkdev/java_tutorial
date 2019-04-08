abstract class Shape {
    int i = 10;
    abstract void draw();
}

class Square extends Shape {
    void draw() {
        System.out.println ("반지름이" + i + "인 사각형을 그립니다.");
    }
}

class Abstract {
    public static void main (String[] args) {
        Square obj = new Square();
        
        System.out.println("사각형 클래스의 i 값은 " + obj.i);
        obj.draw();
    }
}