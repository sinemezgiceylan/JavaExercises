import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {

        double pi = 3.14, area;
        int r, angle;

        Scanner inputr = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = inputr.nextInt();

        Scanner inputAngle = new Scanner(System.in);
        System.out.println("Enter the angle: ");
        angle = inputAngle.nextInt();

        area = (pi * (r *r) * angle) / 360;

        System.out.println("Area: " + area);

    }
}
