public class SeriesSum {
    public static void main(String[] args) {
        int sumEvenFor = 0;
        for (int i = 2; i <= 20; i += 2) {
            sumEvenFor += i;
        }

        int sumOddFor = 0;
        for (int i = 1; i < 20; i += 2) {
            sumOddFor += i;
        }

        int sumEvenWhile = 0;
        int i = 2;
        while (i <= 20) {
            sumEvenWhile += i;
            i += 2;
        }

        int sumOddWhile = 0;
        i = 1;
        while (i < 20) {
            sumOddWhile += i;
            i += 2;
        }

        int sumEvenDoWhile = 0;
        i = 2;
        do {
            sumEvenDoWhile += i;
            i += 2;
        } while (i <= 20);

        int sumOddDoWhile = 0;
        i = 1;
        do {
            sumOddDoWhile += i;
            i += 2;
        } while (i < 20);

        System.out.println("Sum of even numbers using for loop: " + sumEvenFor);
        System.out.println("Sum of odd numbers using for loop: " + sumOddFor);

        System.out.println("Sum of even numbers using while loop: " + sumEvenWhile);
        System.out.println("Sum of odd numbers using while loop: " + sumOddWhile);

        System.out.println("Sum of even numbers using do-while loop: " + sumEvenDoWhile);
        System.out.println("Sum of odd numbers using do-while loop: " + sumOddDoWhile);
    }
}
