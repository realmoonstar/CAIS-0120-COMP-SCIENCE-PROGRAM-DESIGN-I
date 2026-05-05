import java.util.Scanner;

public class volume {
    public static double getVolume(double r, double h) {
        return Math.PI *r * r * h;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r;
        double h;
        double volume;
        String answer;

        do {
            System.out.print("Enter the radius:");
            r = scan.nextDouble();

            System.out.print("Enter the height:");
            h = scan.nextDouble();

            volume = getVolume(r,h);

            System.out.println(volume);

            System.out.print("Try again? y/n:");
            answer=scan.next();

        } while (answer.equals("y"));
        scan.close();
    }
}