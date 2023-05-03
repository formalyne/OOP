package topic5;
public class Main {
    public static void main(String[] args) throws Exception {

        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println(circle.returnArea());
        System.out.println(circle.returnPerimeter());

        Square square = new Square();
        square.setSideLength(17);
        System.out.println(square.returnArea());
        System.out.println(square.returnPerimeter());

        Rhombus rhombus = new Rhombus();
        rhombus.setSideLength(5);
        rhombus.setHeight(18);
        System.out.println(rhombus.returnArea());
        System.out.println(rhombus.returnPerimeter());
    }
}
