import java.util.Scanner;

public class power {

    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int base;
        int exponent;
        int answer;
        String again;

        do {
            System.out.print("Enter the base:");
            base = scan.nextInt();

            System.out.print("Enter the exponent:");
            exponent = scan.nextInt();

            answer = power(base,exponent);

            System.out.println("Result:"+answer);

            System.out.print("Try again? y/n:");
            again = scan.next();

        } while (again.equals("y"));
        scan.close();
        }

    }
