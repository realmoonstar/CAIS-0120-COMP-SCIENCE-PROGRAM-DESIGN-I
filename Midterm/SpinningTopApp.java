import java.util.Scanner;

public class SpinningTopApp
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//asks user make height speed etc traits of spinning top
        System.out.print("Enter make: ");
        String make = input.nextLine();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        System.out.print("Enter max speed: ");
        double maxSpeed = input.nextDouble();

        SpinningTop top = new SpinningTop(make, height, maxSpeed);

        int choice = 0;

//the menu will keep popping up for the user to decide whjat to do like how we did for the car simulation app
        while (choice != 4) {
            System.out.println("\n--- Spinning Top Menu ---");
            System.out.println("1) Rotate");
            System.out.println("2) Accelerate");
            System.out.println("3) Stop");
            System.out.println("4) Quit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter speed: ");
                    double speed = input.nextDouble();

                    System.out.print("Clockwise? (true/false): ");
                    boolean clockwise = input.nextBoolean();

                    if (top.rotate(speed, clockwise)) {
                        System.out.println("Top is now rotating!");
                    } else {
                        System.out.println("Cannot rotate: top is already moving.");
                    }
                    break;

                case 2:
                    System.out.print("Enter speed increase: ");
                    double inc = input.nextDouble();

                    if (top.accelerate(inc)) {
                        System.out.println("Top accelerated!");
                    } else {
                        System.out.println("Cannot accelerate: top is not moving.");
                    }
                    break;

                case 3:
                    top.stop();
                    System.out.println("Top stopped.");
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.println("\nCurrent Status:");
            System.out.println(top.toString());
        }

        input.close();
    }
}
