import java.util.Scanner;

public class IntegerCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println(num+" is a positive integer");
        }
        else
        {
            System.out.println(num+" is not a positive integer");
        }

        sc.close();
    }
}