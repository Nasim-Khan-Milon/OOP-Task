import java.util.Scanner;

public class MedalAward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter letter grade (e.g., 4.0, 3.7): ");
        double grade = sc.nextDouble();

        System.out.print("Has the student completed the semester? (true/false): ");
        boolean completed = sc.nextBoolean();

        if (completed) {
            if (grade >= 3.5) {
                System.out.println("Award: Medal");
            } else {
                System.out.println("Award: No Medal");
            }
        } else {
            System.out.println("Semester not completed");
        }

        sc.close();
    }
}
