import java.util.Scanner;

public class LetterGrade {

    public static String getLetterGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade;
        String letter;
        String allGrades = "";
        String answer;

        do {
            System.out.print("Enter your number grade:");
            grade = scan.nextInt();

            letter = getLetterGrade(grade);
            System.out.println("Your letter grade is " + letter);

            allGrades += letter + ", ";

            System.out.print("Enter a new grade? y/n ");
            answer = scan.next();
        } while (answer.equals("y"));

        System.out.println("Thank you for using this program, your letter grades are: " + allGrades);

        scan.close();
    }
}
