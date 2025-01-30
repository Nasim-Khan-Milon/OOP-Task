public class Reverse_A_Series {
    public static void main(String[] args) {
        int a[] = {12,34,23,4,23,54,22,45,34};

        int i=0, j=a.length-1;

        while (i<=j) {
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }

        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
