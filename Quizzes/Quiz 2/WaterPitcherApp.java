import java.util.Scanner;

public class WaterPitcherApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter make:");
        String make = scan.nextLine();

        System.out.println("Enter color:");
        String color = scan.nextLine();

        System.out.println("Enter max capacity:");
        double capacity = scan.nextDouble();

        System.out.println("Enter filter life:");
        int filterLife = scan.nextInt();

        WaterFilterPitcher pitcher = new WaterFilterPitcher(make, color, capacity, filterLife);

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n1) Fill");
            System.out.println("2) Pour");
            System.out.println("3) Empty");
            System.out.println("4) Check Filter");
            System.out.println("5) Quit");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Liters to fill:");
                double liters = scan.nextDouble();
                if (!pitcher.fill(liters)) {
                    System.out.println("Overflow!");
                }
            }

            else if (choice == 2) {
                System.out.println("Liters to pour:");
                double liters = scan.nextDouble();
                if (!pitcher.pour(liters)) {
                    System.out.println("Not enough water!");
                }
            }

            else if (choice == 3) {
                pitcher.empty();
            }

            else if (choice == 4) {
                if (pitcher.checkFilter()) {
                    System.out.println("Filter OK");
                } else {
                    System.out.println("Filter needs replacement");
                }
            }
        }
    }
}
