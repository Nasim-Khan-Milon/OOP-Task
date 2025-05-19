public class AverageCalculator {
    public static void main(String[] args) {
        double[] values = {12.5, 7.0, 9.3, 15.2, 8.5};
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        double average = sum / values.length;
        System.out.println("Average: " + average);
    }
}
