import java.util.Scanner;
public class CombinationCalculator {
    public static void main(String[] args) {

        int totaln = 1;
        int totalr = 1;
        int total = 1;
        int diff, combination;

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Combination Calculator!\nEnter the number of elements: ");
        int n = input.nextInt();
        System.out.print("Enter the number of options: ");
        int r = input.nextInt();

        diff = (n - r);

        if (n >= 0 && r >= 0 && r <= n) {

            for (int i = 1; i <= n; i++) {
                totaln = totaln * i;
            }

            for (int k = 1; k <= r; k++) {
                totalr = totalr * k;
            }

            for (int m = 1; m <= diff; m++) {
                total = total * m;
            }

            combination = totaln / (totalr * total);
            System.out.println("C(" + n + "," + r + ") = " + combination);

        } else {
            System.out.println("Enter a valid number!");
        }

    }
}
