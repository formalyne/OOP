package topic5;
public class Rhombus extends GeometricFigure {
    private int sideLength;
    private int height;

    @Override
    double returnArea() {
        return sideLength*height;
    }

    @Override
    double returnPerimeter() {
        return sideLength*4;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) throws Exception {
        if (sideLength < 0) {
            throw new Exception("Values lower than 0 are not allowed");
        }
        this.sideLength = sideLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws Exception {
        if (height < 0) {
            throw new Exception("Values lower than 0 are not allowed");
        }
        this.height = height;
    }

}

