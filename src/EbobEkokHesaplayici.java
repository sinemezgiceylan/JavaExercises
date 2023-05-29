import java.util.Scanner;
public class EbobEkokHesaplayici {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        int n = 0;
        int ebob = 1;
        int ekok = 1;

        if (n1 < n2) {
            while (n <= n1) {
                n++;
                if (n1 % n == 0 && n2 % n == 0) {
                    ebob = n;
                }
            }
            System.out.println("Ebob: " + ebob);
        } else {
            while (n <= n2) {
                n++;
                if (n1 % n == 0 && n2 % n == 0) {
                    ebob = n;
                }
            }
            System.out.println("Ebob: " + ebob);
        }

        while (n <= (n1 * n2)) {
            n++;
            if (n % n1 == 0 && n % n2 == 0) {
                ekok = n;
                break;
            }
        }
        System.out.println("Ekok: " + ekok);

    }
}
