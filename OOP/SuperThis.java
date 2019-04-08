class A {
    int a = 10;
    int b = 20;
    void display() {
        System.out.println("A 클래스의 a 값은 "+ a + ", b 의 값은 " + b);
    }
}

class B extends A {
    int a = 100;
    int b = 200;
    void display() {
        System.out.println("B 클래스의 a 값은 " + a + ", b 의 값은 " + b);
    }
    void show() {
        super.display();
        this.display();
        int total = this.a + this.b + super.a + super.b;
        System.out.println("Total = " + total);
    }
}

public class SuperThis {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
    }
}