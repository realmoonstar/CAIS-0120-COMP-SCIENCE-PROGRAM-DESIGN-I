import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char tryAgain = 'y';

        while (tryAgain == 'y' || tryAgain == 'Y') {
            System.out.println("Please enter radius for a cylinder");
            double radius = scan.nextDouble();

            System.out.println("Please enter height for a cylinder");
            double height = scan.nextDouble();

            Cylinder c = new Cylinder(radius, height);

            System.out.println("The volume of the cylinder is: " + c.getVolume());

            System.out.println("Try again? (y/n)");
            tryAgain = scan.next().charAt(0);
        }
    }
}
