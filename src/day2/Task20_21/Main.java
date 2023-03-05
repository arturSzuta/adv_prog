package day2.Task20_21;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        int rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println(rectanglePerimeter);

        Shape cube = new Qube(4);
        System.out.println(((Qube) cube).calculateVolume());
        System.out.println(cube.calculatePerimeter());
        System.out.println(((Qube) cube).fill(27));
    }
}
