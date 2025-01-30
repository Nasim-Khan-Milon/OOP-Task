import java.util.Scanner;

public class Check_Palindrome {

    public static boolean isPalindrome(String s)
    {
        int i=0, j=s.length()-1;

        while (i<=j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.next();

        if(isPalindrome(str))
        {
            System.out.println("Yes Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
