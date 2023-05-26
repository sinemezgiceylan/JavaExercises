import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if (n % 2 == 0 || n % 4 == 0) {
                total += n;
            }

        } while (n % 2 == 0);

        System.out.println("Total: " + total);
    }
}
