public class MethodEx02 {
    static void sum(int n) {
        int tot=0;

        for(int i=1;i<=n;i++)
            tot=tot+i;

            System.out.println("1 부터 " + n + "까지의 합은" + tot);
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        sum(a);
    }
}