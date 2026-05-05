import java.util.Scanner;

public class VariablesFormula {

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D;
        int result;

        System.out.print("Enter value for A: ");
        A = scan.nextInt();

        System.out.print("Enter value for B: ");
        B = scan.nextInt();

        System.out.print("Enter value for C: ");
        C = scan.nextInt();

        System.out.print("Enter value for D: ");
        D = scan.nextInt();

        result = power(A, B) + C + factorial(D);

        System.out.print("Result: " + result);

        scan.close();
    }
}
