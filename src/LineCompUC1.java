import java.util.Scanner;

public class LineCompUC1 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        // Calculate distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Display the result
        System.out.println("The distance between the two points is: " + distance);

        scanner.close();
    }

}
