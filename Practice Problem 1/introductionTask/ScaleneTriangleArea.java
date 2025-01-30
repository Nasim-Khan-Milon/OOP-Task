package introductionTask;
import java.util.Scanner;

public class ScaleneTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        float s = (float) (a+b+c)/3;

        float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(area);

        sc.close();
    }
}
