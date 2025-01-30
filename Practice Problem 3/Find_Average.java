import java.util.Arrays;

public class Find_Average {
    public static void main(String[] args) {
        int a[] = {12,34,23,4,23,54,22,45,34};
        
        int sum = Arrays.stream(a).sum();
        float avg = (float) sum/a.length;

        System.out.println(avg);
    }
}
