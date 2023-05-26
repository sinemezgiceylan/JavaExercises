import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, u, area;

        System.out.print("Enter the 1st side length: ");
        a = input.nextDouble();

        System.out.print("Enter the 2nd side length: ");
        b = input.nextDouble();

        System.out.print("Enter the 3rd side length: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u-a) * (u - b) * (u-c));

        System.out.println("Area of triangle: " + area);

    }
}
