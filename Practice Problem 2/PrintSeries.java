import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Even numbers using for-loop:");
        for (i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Even numbers using while-loop:");
        i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        System.out.println("Even numbers using do-while loop:");
        i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println();


        System.out.println("Odd numbers using for-loop:");
        for (int j=1;j<20;j+=2) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("Odd numbers using while-loop:");
        int j=1;
        while (j <= 20) {
            System.out.print(j + " ");
            j += 2;
        }
        System.out.println();

        System.out.println("Odd numbers using do-while loop:");
        j=1;
        do {
            System.out.print(j + " ");
            j += 2;
        } while (j <= 20);
        System.out.println();

        sc.close();
    }
}
