public class ReverseSeries {
    public static void main(String[] args) {
        int[] series = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = series.length - 1; i >= 0; i--) {
            System.out.print(series[i] + " ");
        }
    }
}
