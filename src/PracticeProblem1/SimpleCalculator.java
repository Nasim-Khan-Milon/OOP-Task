import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scan.nextInt();

        System.out.print("Enter second integer: ");
        int b = scan.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char ch = scan.next().charAt(0);

        if (ch == '+') {
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '/') {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }

        scan.close();
    }
}
