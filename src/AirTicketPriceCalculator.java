import java.util.Scanner;
public class AirTicketPriceCalculator {
    public static void main(String[] args) {

        int km, age, trip;
        double perkKm = 0.10, amount;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        km = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter trip type (1 => One Way, 2 => Round Trip): ");
        trip = input.nextInt();

        amount = km * perkKm;

        if (km > 0 && age > 0) {

            switch (trip) {
                case 1:
                    if (age < 12) {
                        amount -= amount * 0.5;
                        System.out.println("Total Amount: " + amount + " TL");
                    } else if (age >= 12 && age <= 24){
                        amount -= amount * 0.1;
                        System.out.println("Total Amount: " + amount + " TL");
                    } else if (age >= 65) {
                        amount -= amount * 0.3;
                        System.out.println("Total Amount: " + amount + " TL");
                    } else {
                        System.out.println("Total Amount: " + amount + " TL");
                    }
                    break;

                case 2:
                    amount -= amount * 0.2;
                    if (age < 12) {
                        amount -= amount * 0.5;
                        System.out.println("Total Amount: " + (2 * amount) + " TL");
                    } else if (age >= 12 && age <= 24){
                        amount -= amount * 0.1;
                        System.out.println("Total Amount: " + (2 * amount) + " TL");
                    } else if (age >= 65) {
                        amount -= amount * 0.3;
                        System.out.println("Total Amount: " + (2 * amount) + " TL");
                    } else {
                        System.out.println("Total Amount: " + (2 * amount) + " TL");
                    }
                    break;

                default:
                    System.out.println("Incorrect data entry!");
                    break;
            }
        } else {
            System.out.println("Incorrect data entry!");
        }
    }
}
