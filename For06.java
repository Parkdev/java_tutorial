class For06{
    public static void main(String[] args) {
        int i;
        int total = 0;

        for (i=1; i<=5; i++)
        {
            total += i;
            System.out.println(total);
        }
            
        System.out.println("1 ~ " + (i-1) + " = " + total);
    }
}