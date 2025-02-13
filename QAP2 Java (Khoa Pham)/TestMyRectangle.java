public class TestMyRectangle {
    public static void main(String[] args) {
        // Create rectangle using pointA and pointB
        MyPoint pointA = new MyPoint(1, 4);
        MyPoint pointB = new MyPoint(5, 1);
        MyRectangle rectangle = new MyRectangle(pointA, pointB);

        // Print initial rectangle
        System.out.printf("Initial Rectangle: %s%n", rectangle);

        // Calculate and print properties
        System.out.printf("Area of the Rectangle: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter of the Rectangle: %.2f%n", rectangle.getPerimeter());
        System.out.printf("Diagonal of the Rectangle: %.2f%n", rectangle.getDiagonal());

        // Update points
        rectangle.setPointA(new MyPoint(2, 5));
        rectangle.setPointB(new MyPoint(6, 2));

        // Print updated rectangle
        System.out.printf("Updated Rectangle: %s%n", rectangle);

        // Recalculate and print properties
        System.out.printf("Updated Area of the Rectangle: %.2f%n", rectangle.getArea());
        System.out.printf("Updated Perimeter of the Rectangle: %.2f%n", rectangle.getPerimeter());
        System.out.printf("Updated Diagonal of the Rectangle: %.2f%n", rectangle.getDiagonal());
    }
}
