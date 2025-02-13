public class TestMyLine {
    public static void main(String[] args) {
        // Create MyLine objects with valid points
        MyLine line1 = new MyLine(1, 2, 4, 6);
        System.out.printf("Initial Line: %s%n", line1); // Uses toString() to format the output

        // Modify the points using setters
        line1.setBeginXY(2, 3);
        line1.setEndXY(5, 7);
        System.out.printf("Updated Line: %s%n", line1); // Prints updated line

        // Using individual setters for points
        line1.setBeginX(0);
        line1.setBeginY(1);
        line1.setEndX(3);
        line1.setEndY(4);
        System.out.printf("After setting individual coordinates: %s%n", line1);

        // Get and print length of the line
        System.out.printf("Length of the Line: %.2f%n", line1.getLength());

        // Get and print gradient of the line
        System.out.printf("Gradient of the Line: %.2f%n", line1.getGradient()); 

        // Get and print gradient from radians to degrees of the line
        System.out.printf("Gradient convert from radians to degrees of the Line: %.2f%n", Math.toDegrees(line1.getGradient())); 
    }
}
