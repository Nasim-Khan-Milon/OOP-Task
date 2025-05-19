public class SeriesForLoop {
    public static void main(String[] args) {

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


public class SeriesWhileLoop {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        i = 1;
        while (i < 20) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }
}


public class SeriesDoWhileLoop {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
        System.out.println();

        i = 1;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i < 20);
        System.out.println();
    }
}

