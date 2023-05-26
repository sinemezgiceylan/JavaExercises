import java.util.Scanner;
public class UserLoginProgram {
    public static void main(String[] args) {

        String userName, password, newPassword, response;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username:  ");
        userName = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("kodluyoruz")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("login failed!");
            System.out.println("Would you like to reset your password (yes or no): ");
            response = input.nextLine();
            if (response.equals("yes")) {
                System.out.println("Enter your new password: ");
                newPassword = input.nextLine();
                if (newPassword.equals("kodluyoruz")) {
                    System.out.println("Could not create password, please enter another password.");
                } else {
                    System.out.println("Password created");
                }

            }
        }
    }
}
