import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " is Perfect Number!");
        } else {
            System.out.println(number + " is not Perfect Number!");
        }

    }
}
