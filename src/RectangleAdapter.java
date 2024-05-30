public class RectangleAdapter extends Circle {

    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public int getRadius() {
        return (int) (rectangle.getWidth() * Math.sqrt(2) / 2);
    }
}
