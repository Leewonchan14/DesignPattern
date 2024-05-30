public class Client {
    public static void main(String[] args) {
//        Circle circle = new Circle(3);
//        Rectangle rectangle = new Rectangle(3);
//
//        circle.getRadius();
////        rectangle.getRadius() ??
        Circle circle1 = new Circle(3);
        Circle circle2 = new RectangleAdapter(new Rectangle(3));

        circle1.getRadius();
        circle2.getRadius();

    }
}
