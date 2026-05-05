import java.util.Scanner;

public class ThreeDiceApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Die d1 = new Die();
        Die d2 = new Die();
        Die d3 = new Die();

        int rollCount = 0;
        char answer = 'y';

        while (answer == 'y') {

            int v1 = d1.roll();
            int v2 = d2.roll();
            int v3 = d3.roll();

            rollCount++;

            int total = v1 + v2 + v3;

            System.out.println("Total rolled: " + total);

            if (total % 5 == 0) {
                System.out.println("The total IS a multiple of 5!");
            } else {
                System.out.println("The total is NOT a multiple of 5.");
            }

            System.out.println("Roll again? (y/n)");
            answer = scanner.next().charAt(0);
        }

        System.out.println("\nAverages:");
        System.out.println("Die 1 average: " + (d1.getTotal() / (double) rollCount));
        System.out.println("Die 2 average: " + (d2.getTotal() / (double) rollCount));
        System.out.println("Die 3 average: " + (d3.getTotal() / (double) rollCount));
    }
}
