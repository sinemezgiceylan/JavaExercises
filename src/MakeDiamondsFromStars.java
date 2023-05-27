import java.util.Scanner;
public class MakeDiamondsFromStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n/2 + 1; i++) {
            for (int j = 1; j <= (n/2 - i +2); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n/2; i >= 0; i--) {
            for (int j = 1; j <= n/2 - i + 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
