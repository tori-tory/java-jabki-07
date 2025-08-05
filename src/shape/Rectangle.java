package shape;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if ((width <= 0) || (height <= 0)) {
            throw new IllegalArgumentException("Ширина и высота должны быть больше 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
