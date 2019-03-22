class Grade {
    int e; // 인스턴스 변수
    int m;

    void input_grade(int a, int b) {
        e = a;
        m = b;
    }

    void output_grade() {
        System.out.println(e+m);
    }
}

public class GradeOutput {
    public static void main(String args[]) // 클래스 변수
    {
        Grade g1, g2;
        g1 = new Grade();
        g2 = new Grade();
        g1.input_grade(90, 85);
        g2.input_grade(80, 80);

        g1.output_grade();
        g2.output_grade();
    }
}