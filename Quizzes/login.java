import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String correctUsername = "Admin";
        String correctPassword = "KoolAid";

        String username;
        String password;
        String again;

        int attempts = 0;

        do {
            System.out.print("Enter username:");
            username = scan.next();

            System.out.print("Enter password:");
            password = scan.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Successful login attempt!!");
                break;
            } else {
                System.out.println("The username and password are both incorrect!!");
                attempts += 1;
                if(attempts ==10) {
                    System.out.println("You have exceeded the number of authorized login attempts.");
                    break;
                }
                System.out.println("Try again? y/n:");
                again = scan.next();

            }

            } while (again.equals("y")) ;
            scan.close();

    }
}