package day2.Task20_21;

public class Cone extends Shape3D{
    private final int height;
    private final int radius;
    private final int slantHeight;

    public Cone(int height, int radius, int slantHeight) {
        this.height = height;
        this.radius = radius;
        this.slantHeight = slantHeight;
    }

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
