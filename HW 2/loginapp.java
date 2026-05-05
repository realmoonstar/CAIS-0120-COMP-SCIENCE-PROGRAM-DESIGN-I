import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LoginValidation login = new LoginValidation("Mickey", "Donald", 3);

        int result = -1;

        while (result != 0 && result != 4) {

            System.out.print("Enter username: ");
            String u = scanner.nextLine();

            System.out.print("Enter password: ");
            String p = scanner.nextLine();

            result = login.validateLogin(u, p);

            switch (result) {
                case 0:
                    System.out.println("Login successful!");
                    break;
                case 1:
                    System.out.println("Incorrect username.");
                    break;
                case 2:
                    System.out.println("Incorrect password.");
                    break;
                case 3:
                    System.out.println("Both username and password are incorrect.");
                    break;
                case 4:
                    System.out.println("Maximum attempts exceeded.");
                    break;
            }
        }
    }
}
