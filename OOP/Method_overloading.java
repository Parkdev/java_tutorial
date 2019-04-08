public class Method_overloading {
    static void printstr(String the_string){
        System.out.println(the_string);
    }

    static void printstr(char the_char, int repeat_cnt) {
        for(int i =0; i < repeat_cnt; i++)
            System.out.print(the_char);
        System.out.println();
    }

    public static void main(String[] args) {
        printstr("행복한 자바");
        printstr('A', 5);
    }
}