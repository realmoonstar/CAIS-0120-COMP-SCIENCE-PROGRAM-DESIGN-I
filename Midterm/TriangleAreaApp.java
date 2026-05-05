import java.util.Scanner;

public class TriangleAreaApp
{
    public static void main(String args[])
    {
        Triangle triangle = new Triangle(0.0, 0.0);
        Scanner scan = new Scanner(System.in);
        char tryAgain = 'y';

        while (tryAgain == 'y' || tryAgain == 'Y')
        {

            System.out.println("Please enter base for a triangle");

            //Take user input and set it into the triangle object for base
            triangle.setBase( scan.nextDouble() );

            System.out.println("Please enter height for a triangle");

            //Take user input and set it into the triangle object for height
            triangle.setHeight( scan.nextDouble() );
            Triangle Area = new Triangle(triangle.getBase(),triangle.getHeight());


            System.out.println("The area of the triangle is: " + Area);

            System.out.println("Try again? (y/n)");
            tryAgain = scan.next().charAt(0);
        }
    }
}
