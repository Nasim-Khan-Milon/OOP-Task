import java.util.Scanner;

public class Count_Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.next();

        System.out.println("Enter a cherecter : ");
        char ch = sc.next().charAt(0);

        int cnt=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                cnt++;
        }

        System.out.println(cnt);
    }
    
}
