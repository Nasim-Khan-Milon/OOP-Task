public class TriangleArea {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        double c = 7.0;

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(area);
    }
}
