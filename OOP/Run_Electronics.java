 class Electronics {
    private  int nVoltage = 0;
    
    public void turnOn(int nInputVoltage) {
        nVoltage = nInputVoltage;
    }
    public void turnOff() {
        nVoltage = 0;
    }
    public int getVoltage() {
        return nVoltage;
    }
    
}

public class Run_Electronics {
    public static void main(String[] args) {
        Electronics a = new Electronics();
        a.turnOn(5);
        System.out.println(a.getVoltage());
    }
}