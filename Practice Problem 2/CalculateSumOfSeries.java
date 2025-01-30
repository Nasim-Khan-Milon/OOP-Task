import java.util.Scanner;

public class CalculateSumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1=0,sum2=0,i=2,j=1;

        for (i = 2; i <= 20; i += 2) {
            sum1+=i;
        }

        for (j=1;j<20;j++) {
            sum2+=j;
        }

        System.out.println("sum of 1st series is "+sum1);
        System.out.println("sum of 2nd series is "+sum2);

        sc.close();
    }
}
