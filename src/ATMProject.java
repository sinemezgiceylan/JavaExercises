import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class ATMProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        int price;

        System.out.println("Kodluyoruz Bankasına Hoşgeldiniz");
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Giriş yapıldı!");
                do {
                    System.out.println("1-Para Yatırma\n " + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("İşleminiz gerçekleşti.");
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= price;
                                System.out.println("İşleminiz gerçekleşti.");
                            }
                            break;

                        case 3:
                            System.out.println("Güncel bakiyeniz: " + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Çıkış yapıldı!");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre! Tekrar deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke edildi! Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan deneme hakkınız: " + right);
                }
            }
        }

    }
}
