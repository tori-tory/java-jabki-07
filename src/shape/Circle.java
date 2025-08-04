package shape;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
