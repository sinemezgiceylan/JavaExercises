import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int lastNumber;
        int total = 0;

        while (number != 0) {
            lastNumber = number % 10;
            total += lastNumber;
            number /= 10;

        }
        System.out.println("Sum of digits: " + total);
    }
}
