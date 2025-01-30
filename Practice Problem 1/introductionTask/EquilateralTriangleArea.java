package introductionTask;
import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arm= sc.nextInt();

        float area = (float) (Math.sqrt(3)*arm*arm)/4;

        System.out.println(area);

        sc.close();
    }
}
