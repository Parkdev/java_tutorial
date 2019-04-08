class Point03{
    private int x;
    private int y;
    public void setX(int new_x){
        x=new_x;
    }
    public void setY(int new_y){
        y=new_y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int sum(){
        return x+y;
    }
}

public class Private_mem {
    public static void main(String[] args) {
        Point03 pt03 = new Point03();
        pt03.setX(10);
        pt03.setY(20);
        System.out.print(pt03.getX() + "+" + pt03.getY() + "=" + pt03.sum());
    }
}