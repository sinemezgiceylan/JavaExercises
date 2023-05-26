import java.util.Scanner;
public class ActivitySuggestor {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can go skiing!");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("You can go to the cinema!");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("You can go on a picnic!");
        } else {
            System.out.println("You can go swimming!");
        }
    }
}
