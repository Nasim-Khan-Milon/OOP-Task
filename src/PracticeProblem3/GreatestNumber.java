public class GreatestNumber {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34, 22};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Greatest number: " + max);
    }
}
