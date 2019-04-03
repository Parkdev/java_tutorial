class Opr08 //대입 연산자와 증감연산자
{
    public static void main(String[] args)
    {
        int a=10, b=10;
        System.out.println(++a); // 선행처리
        System.out.println(a);

        System.out.println(b++); // 후행처리
        System.out.println(b);
    }
}