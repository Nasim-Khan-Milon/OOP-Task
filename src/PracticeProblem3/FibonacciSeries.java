public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 12;
        int a = 0, b = 1;

        System.out.print(a + ", " + b);

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}
