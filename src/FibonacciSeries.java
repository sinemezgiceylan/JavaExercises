import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want to find the fibonacci series?: ");
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int total;

        for (int i = 1; i <= n+1; i++) {
            System.out.print(num1 + " ");
            total = num1 + num2;
            num1 = num2;
            num2 = total;
        }
    }
}
