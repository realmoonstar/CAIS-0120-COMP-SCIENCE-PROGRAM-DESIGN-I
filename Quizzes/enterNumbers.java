import java.util.Scanner;

public class enterNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        String answer;
        do {
            System.out.print("Enter a number:");
            number = scan.nextInt();

            if (number % 2 == 0) {
               evenSum += number;
               evenCount += 1;
            } else {
                oddSum += number;
                oddCount += 1;
            }
            System.out.print("Do you want to enter another number? y/n");
            answer = scan.next();
        } while (answer.equals("y"));
        if (evenCount > 0) {
            System.out.println("Average of even numbers:" + (evenSum / evenCount));
        } else {
            System.out.println("No even numbers entered");
        }

        if (oddCount > 0) {
            System.out.println("Average of odd numbers:" + (oddSum / oddCount));
        } else {
            System.out.println("No odd numbers entered");
        }
        scan.close();
    }
}
