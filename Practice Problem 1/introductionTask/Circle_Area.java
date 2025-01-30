package introductionTask;

import java.util.Scanner;
public class Circle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi=(float)3.1416;
        float radius = sc.nextFloat();

        float area = pi*radius*radius;

        sc.close();

    }
}
