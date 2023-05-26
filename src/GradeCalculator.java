import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {

        int math, physical, turkish, chemistry, music;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = input.nextInt();

        System.out.print("Physical Grade: ");
        physical = input.nextInt();

        System.out.print("Turkish Grade: ");
        turkish = input.nextInt();

        System.out.print("Chemistry Grade: ");
        chemistry = input.nextInt();

        System.out.print("Music Grade: ");
        music = input.nextInt();

        average = (math + physical + turkish + chemistry + music) / 5;

        if (math >= 0 && math <= 100 || physical >= 0 && physical <= 100 || turkish >= 0 && turkish <= 100 || chemistry >= 0 && chemistry <= 100 || music >= 0 && music <= 100) {
            if (average >= 50) {
                System.out.println("Grade Average: " + average);
                System.out.println("You passed the class!");
            } else {
                System.out.println("You failed the class!");
            }
        } else {
            System.out.println("Grades must be between 1 and 100!");
        }
    }
}
