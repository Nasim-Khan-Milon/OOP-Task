import java.util.Scanner;

public class Giving_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the percentage of target sales achieved: ");
        double salesPercentage = sc.nextDouble();

        System.out.print("Enter the attendance percentage: ");
        double attendancePercentage = sc.nextDouble();

        int bonus;
        if (salesPercentage >= 95) 
        {
            if (attendancePercentage == 100) 
            {
                bonus = 60;
            } 
            else if (attendancePercentage >= 90) 
            {
                bonus = 40;
            } 
            else 
            {
                bonus = 5;
            }
        } 
        else if (salesPercentage >= 80) 
        {
            if (attendancePercentage == 100) 
            {
                bonus = 40;
            } 
            else if (attendancePercentage >= 90) 
            {
                bonus = 20;
            } 
            else 
            {
                bonus = 5;
            }
        } 
        else 
        {
            bonus = 5; 
        }

        System.out.println("The bonus percentage is: " + bonus + "%");

        sc.close();
    }
}
