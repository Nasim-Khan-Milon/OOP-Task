public class Find_Greatest_Number {

    public static void main(String[] args) {
        int a[] = {12,34,23,4,23,54,22,45,34};
        int mx = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>mx)
                mx=a[i];
        }

        System.out.println(mx);
    }
}