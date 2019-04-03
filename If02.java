class If02 {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);

        if(num%2 == 1)
            System.out.println(num + "는 홀수입니다.");
        
        else
            System.out.println(num + "는 짝수입니다.");
    }
}