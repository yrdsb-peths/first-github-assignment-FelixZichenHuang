public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double theLength, double theWidth) {
        length = theLength;
        width = theWidth;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "The rectangle has a length of " + length + ", a width of " + width + ", and an area of "
                + length * width + ".";
    }
}