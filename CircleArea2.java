// 생성자

class Circle {
    private int r;  //메소드; 
    public Circle(int a) { //클래스와 이름이 동일한 메소드; 반환형이 명시되어있지않음 ;; 이것이 생성자
        r = a;
    }
    public double getArea(){  // 어디서든 이 함수를 가져다 사용할 수 있다.
        return r * r * 3.141592;
    }
}

public class CircleArea2 {
    public static void main(String.args[]) { // 메인함수
        // Circle c;
        // c = new Circle(5);
        Circle c = new Circle(5); // 클래스 참조형 변수선언
        // c.r = 5; // c의 r을 5로 변경 ; 데이터 변경
        //System.out.println(c,r);
        System.out.println(c.getArea());  // c에있는 getArea메소드 실행
    }
}