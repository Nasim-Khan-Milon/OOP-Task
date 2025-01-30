package introductionTask;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float area = (base*height)/2;
        System.out.println(area);

        sc.close();
    }
}
