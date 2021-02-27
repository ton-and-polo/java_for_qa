public class Main {
    public static void main (String[] args) {

        // Create two point objects:
        Point firstPoint = new Point(-2.3, 4.0);
        Point secondPoint = new Point(8.5, 0.7);



        // Print out the distance between two points
        // (rounded up to the second decimal):
        System.out.printf("The distance between {%.1f, %.1f} and {%.1f, %.1f} " +
                "is:\n", firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);

        // Function:
        System.out.printf("Function result: %.2f\n", distance(firstPoint, secondPoint));
        // Method:
        System.out.printf("Method result: %.2f\n", firstPoint.distance(secondPoint));
    }

    public static double distance (Point firstPoint, Point secondPoint) {
        return Math.sqrt(Math.pow((secondPoint.x - firstPoint.x), 2.0) + Math.pow((secondPoint.y - firstPoint.y), 2.0));
    }
}
