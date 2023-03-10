package day1.Task9_11;

public class Circle implements Movable, Resizable{
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(
                Math.pow(point.getX() - center.getX(), 2) +
                Math.pow(point.getY() - center.getY(), 2));
    }
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resizable(double resizeFactor) {
        point.setX(point.getX() * resizeFactor);
        point.setY(point.getY() * resizeFactor);
    }
}
