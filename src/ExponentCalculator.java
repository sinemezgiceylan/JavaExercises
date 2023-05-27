import java.util.Scanner;
public class ExponentCalculator {
    public static void main(String[] args) {

        int m,n;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base: ");
        m = input.nextInt();
        System.out.print("Enter a exponent: ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            total *= m;
        }
        System.out.println("Result: " + total);
    }
}
