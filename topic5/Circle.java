package topic5;

public class Circle extends GeometricFigure {
    private int radius;

    @Override
    double returnArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double returnPerimeter() {
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws Exception {
        if (radius < 0) {
            throw new Exception("Values lower than 0 are not allowed");
        }
        this.radius = radius;
    }

}

