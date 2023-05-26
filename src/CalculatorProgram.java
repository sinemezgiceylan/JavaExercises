import java.util.Scanner;
public class CalculatorProgram {
    public static void main(String[] args) {

        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division: ");
        select = input.nextInt();


        switch (select){
            case 1:
                System.out.println("Result: "+ (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 / number2));
                } else {
                    System.out.println("A number is not divisible by 0");
                }
                break;
            default:
                System.out.println("Enter a valid operation!");
        }
    }
}
