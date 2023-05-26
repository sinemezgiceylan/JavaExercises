import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        double height, BMI;
        int weight;

        Scanner inputHeight = new Scanner(System.in);
        System.out.print("Please enter your height(in meters): ");
        height = inputHeight.nextDouble();

        Scanner inputWeight = new Scanner(System.in);
        System.out.print("Please enter your weight: ");
        weight = inputWeight.nextInt();

        BMI = weight / (height * height);

        System.out.println("Your BMI: " + BMI);
    }
}
