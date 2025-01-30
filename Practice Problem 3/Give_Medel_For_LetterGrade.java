import java.util.Scanner;

public class Give_Medel_For_LetterGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's letter grade: ");
        double grade = sc.nextDouble();

        System.out.print("Has the student completed the semester? (yes/no): ");
        String semesterCompleted = sc.next().toLowerCase();

        if (semesterCompleted.equals("yes")) 
        {
            if (grade >= 3.5) 
            {
                System.out.println("The student is eligible for a medal.");
            } else {
                System.out.println("The student's grade is too low for a medal.");
            }
        } 
        else 
        {
            System.out.println("The student must complete the semester to be eligible for a medal.");
        }

        sc.close();
    }
}
