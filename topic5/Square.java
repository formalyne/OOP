package topic5;

public class Square extends GeometricFigure {
    private int sideLength;

    @Override
    double returnArea() {
        return sideLength * sideLength;
    }

    @Override
    double returnPerimeter() {
        return sideLength * 4;
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


}
