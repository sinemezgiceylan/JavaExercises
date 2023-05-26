import java.util.Scanner;
public class PowersOfFourAndFive {
    public static void main(String[] args) {
        int n;
        int total = 0;
        int total2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4 to the power of " + total + ": " + i);
            total++;
        }
        for (int k = 1; k <= n; k *= 5) {
            System.out.println("5 to the power of " + total2 + ": " + k);
            total2++;
        }
    }
}
