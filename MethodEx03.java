public class MethodEx03 {
    static int sum(int n) {
        int tot=0;

        for(int i=1;i<=n;i++)
            tot=tot+i;

            // System.out.println("1 부터 " + n + "까지의 합은" + tot);

        return tot;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int result = sum(a);
        System.out.println("1 부터 " + a + "까지의 합은" + result);
    }
}