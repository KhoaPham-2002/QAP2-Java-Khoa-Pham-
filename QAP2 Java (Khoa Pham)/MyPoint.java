public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get x and y as an array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Calculate distance between this point and another point
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // toString method
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
