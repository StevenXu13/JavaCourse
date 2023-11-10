public class Rectangle {
    private int height;
    private int width;
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public double area() {
        double area;
        area = height * width;
        return area;
    }
    public double perimeter() {
        double perimeter;
        perimeter = (height + width) * 2;
        return perimeter;
    }
}
