class Switch04 {
    public static void main(String[] args) {
        String str = args[0];
        char ch;
        ch=str.charAt(0); //='c';
        switch(ch) {
            case 'A':
            case 'a': System.out.println("America"); break;
            case 'C':
            case 'c': System.out.println("Canada"); break;
            case 'K' :
            case 'k' : System.out.println("Korea"); break;
            default : System.out.println("error");
        }
    }
}