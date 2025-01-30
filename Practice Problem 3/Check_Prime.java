import java.util.Scanner;

public class Check_Prime {

    public static boolean isPrime(int n)
    {
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;

        for(int i=5;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();

        if(isPrime(num))
        {
            System.out.println(num+" is a Prime Number.");
        }
        else
        {
            System.out.println(num+" is not a Prime Number.");
        }

        sc.close();
    }
}
