public class OddEvenCount {
    public static void main(String[] args) {
        int[] values = {12, 7, 9, 15, 8, 22, 33, 44, 55, 60};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : values) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
