import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int tempNum = number;
        int digitNum = 0;
        int digit;
        int digitLast;
        int result = 0;

        while (tempNum != 0) {
            tempNum /= 10;
            digitNum++;
        }

        tempNum = number;

        while (tempNum != 0) {
            digitLast = tempNum % 10;
            int digitPow = 1;
            for (int i = 1; i <= digitNum; i++) {
                digitPow *= digitLast;
            }
            result += digitPow;
            tempNum /= 10;
        }

        if (result == number) {
            System.out.println(number + " is Armstrong number!");
        } else {
            System.out.println(number + " is not Armstrong number!");
        }

    }
}
