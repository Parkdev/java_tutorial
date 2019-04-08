class A{
    int a = 1;
}
class B extends A {
    public int b = 2;
}
class C extends B {
    protected int c = 3;
}

class Inherit {
    public static void main(String[] args) {
        C ins = new C();
        System.out.println("ins 의 객체속성 변수 a 는 " + ins.a);
        System.out.println("ins 의 객체속성 변수 b 는 " + ins.b);
        System.out.println("ins 의 객체속성 변수 c 는 " + ins.c);
    }
}