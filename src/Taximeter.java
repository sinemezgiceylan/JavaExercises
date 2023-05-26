import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, totalAmount = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");

        km = input.nextInt();

        totalAmount += (km * perKm);

        totalAmount = (totalAmount <20) ? 20 : totalAmount;
        System.out.println("Total Amount: " + totalAmount);

    }
}
