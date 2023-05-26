import java.util.Scanner;

public class GroceryCashierProgram {

    public static void main(String[] args) {

        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, auberginePrice = 5.00, total;
        int pear, apple, tomato, banana, aubergine;

        Scanner input = new Scanner(System.in);
        System.out.print("How many kilograms of pears: ");
        pear = input.nextInt();

        System.out.print("How many kilograms of apple: ");
        apple = input.nextInt();

        System.out.print("How many kilograms of tomato: ");
        tomato = input.nextInt();

        System.out.print("How many kilograms of banana: ");
        banana = input.nextInt();

        System.out.print("How many kilograms of aubergine: ");
        aubergine = input.nextInt();

        total = (pearPrice * pear) + (applePrice * apple) + (tomatoPrice * tomato) + (bananaPrice * banana) + (auberginePrice * aubergine);
        System.out.println("Total Amount: " + total);

    }
}
