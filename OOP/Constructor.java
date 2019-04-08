class Point2 {
    int x;
    int y;

    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
    public Point2() {
        System.out.println("매개 변수가 없는 디폴트 생성자");
    }
    public Point2(int new_x, int new_y) {
        x=new_x;
        y=new_y;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Point2 pt01 = new Point2();
        pt01.showPoint();
    }
}