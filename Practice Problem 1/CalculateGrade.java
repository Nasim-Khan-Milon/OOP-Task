import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String grade;

        switch (number/10) {
            case 10: // For scores 100 (optional redundancy)
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "A-";
                break;
            case 6:
                grade = "B";
                break;
            case 4: // Covers 40-59
            case 5:
                grade = "C+";
                break;
            default: // Covers all scores below 40
                grade = "F";
                break;
        }
        System.out.println("Your grade is: " + grade);

        sc.close();
    }
}
