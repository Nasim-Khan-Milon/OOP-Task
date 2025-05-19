import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        String grade;

        if (score >= 0 && score <= 39) {
            grade = "F";
        } else if (score <= 59) {
            grade = "C+";
        } else if (score <= 69) {
            grade = "B";
        } else if (score <= 79) {
            grade = "A-";
        } else if (score <= 89) {
            grade = "A";
        } else {
            grade = "A+";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
