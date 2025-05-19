import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the ball: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The volume of the ball is: %.2f\n", volume);
    }
}
