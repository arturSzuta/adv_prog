package day1.Task9_11;

public class Task9 {
    public static void main(String[] args) {
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(0,3);
        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        MoveDirection moveDirection = new MoveDirection(4, -2);
        circle.move(moveDirection);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}
