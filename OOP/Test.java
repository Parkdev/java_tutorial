class TV {
    private int nSize = 0;

    public TV(int nNewSize) {
        nSize = nNewSize;
    }
    public void get_TV() {
        System.out.println(nSize);
    }
}

public class Test {
    public static void main(String args[]) {
        TV tv1 = new TV(5);
        TV tv2 = new TV(10);
        tv1.get_TV();
        tv2.get_TV();
    }
}