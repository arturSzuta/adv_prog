package day2.Task20_21;

public class Qube extends Shape3D implements Fillable{

    private final int a;

    public Qube(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return a * 12;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a,3);
    }

    @Override
    public int fill(double volume) {
        double maxVolume = calculateVolume();
        if (maxVolume == volume) {
            return 0;
        } else if ( maxVolume > volume) {
            return -1;
        }
        return 1;
    }
}
