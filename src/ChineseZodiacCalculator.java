import java.util.Scanner;
public class ChineseZodiacCalculator {
    public static void main(String[] args) {

        int date;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your date of birth: ");
        date = input.nextInt();

        switch (date %= 12) {
            case 0:
                System.out.println("Your chinese zodiac horoscope: Monkey");
                break;
            case 1:
                System.out.println("Your chinese zodiac horoscope: Rooster");
                break;
            case 2:
                System.out.println("Your chinese zodiac horoscope: Dog");
                break;
            case 3:
                System.out.println("Your chinese zodiac horoscope: Pig");
                break;
            case 4:
                System.out.println("Your chinese zodiac horoscope: Mouse");
                break;
            case 5:
                System.out.println("Your chinese zodiac horoscope: Ox");
                break;
            case 6:
                System.out.println("Your chinese zodiac horoscope: Tiger");
                break;
            case 7:
                System.out.println("Your chinese zodiac horoscope: Rabbit");
                break;
            case 8:
                System.out.println("Your chinese zodiac horoscope: Dragon");
                break;
            case 9:
                System.out.println("Your chinese zodiac horoscope: Snake");
                break;
            case 10:
                System.out.println("Your chinese zodiac horoscope: Horse");
                break;
            case 11:
                System.out.println("Your chinese zodiac horoscope: Sheep");
                break;
            default:
                break;
        }
    }
}
