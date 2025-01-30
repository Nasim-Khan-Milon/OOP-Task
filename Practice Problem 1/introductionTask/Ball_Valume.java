package introductionTask;
import java.util.Scanner;

public class Ball_Valume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi=(float)3.1416;
        float radius = sc.nextFloat();

        float area = (4*pi*radius*radius*radius)/3;

        System.out.println(area);

        sc.close();
    }
}
