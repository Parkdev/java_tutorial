public class IfElseTest {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        if (n>10) 
            System.out.println("10보다 큼");
        else if (n>3) 
            System.out.println("3보다 큼");
        else 
            System.out.println("3보다 작다");
    }
}