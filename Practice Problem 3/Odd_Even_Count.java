public class Odd_Even_Count {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int odd=0, even=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("Odd element frequency is : "+odd);
        System.out.println("Even element frequency is : "+even);
    }
}
