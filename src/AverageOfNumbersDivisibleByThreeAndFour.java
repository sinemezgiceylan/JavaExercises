import java.util.Scanner;
public class AverageOfNumbersDivisibleByThreeAndFour {
    public static void main(String[] args) {

        int number, total = 0, period = 0, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                total += i;
                period++;
            }
        }
        average = total / period;
        System.out.println("Average: " + average);
    }
}
