public class MyRectangle {
    private MyPoint pointA; // Represents one corner
    private MyPoint pointB; // Represents the opposite corner

    // Constructor
    public MyRectangle(MyPoint pointA, MyPoint pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    // Getters and Setters
    public MyPoint getPointA() { return pointA; }
    public void setPointA(MyPoint pointA) { this.pointA = pointA; }

    public MyPoint getPointB() { return pointB; }
    public void setPointB(MyPoint pointB) { this.pointB = pointB; }

    // Calculate width
    public int getWidth() {
        return Math.abs(pointB.getX() - pointA.getX());
    }

    // Calculate height
    public int getHeight() {
        return Math.abs(pointA.getY() - pointB.getY());
    }

    // Calculate area
    public double getArea() {
        return getWidth() * getHeight();
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Calculate diagonal length
    public double getDiagonal() {
        int width = getWidth();
        int height = getHeight();
        return Math.sqrt(width * width + height * height);
    }

    // toString method
    public String toString() {
        return String.format("MyRectangle[pointA=%s, pointB=%s]", pointA, pointB);
    }
}
