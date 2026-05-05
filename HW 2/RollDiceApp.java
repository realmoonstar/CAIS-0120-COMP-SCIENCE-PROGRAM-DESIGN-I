import java.util.Scanner;

public class RollDiceApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Die die1 = new Die();
        Die die2 = new Die();

        char answer = 'y';

        while (answer == 'y') {

            int v1 = die1.roll();
            int v2 = die2.roll();

            System.out.println("The total value rolled between both dice is: " + (v1 + v2));

            System.out.println("Do you want to roll the dice again? (y/n)");
            answer = scanner.next().charAt(0);
        }

        System.out.println("The total sum of dice 1 values rolled is: " + die1.getTotal());
        System.out.println("The total sum of dice 2 values rolled is: " + die2.getTotal());
    }
}
