package shape;

public class Graph {
    public static void main(String[] args) {
        Shape [] shape = new Shape[3];
        shape[0] = new Triangle(10, 10, 100, 50);
        shape[1] = new Circle(20, 20, 5);
        shape[2] = new Rectangle(30, 30, 200, 300);

        for (Shape s : shape) {
            System.out.println(s);
            System.out.println(s.getArea());
            System.out.println(s.getCircumference());
            System.out.println();
        }
    }
}
