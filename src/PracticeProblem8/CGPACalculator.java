public class CGPACalculator {
    public static void main(String[] args) {

        double[][] gradePoints = {
                {9.0, 8.5, 7.0, 6.5, 9.5},
                {7.0, 8.0, 7.5, 8.5, 6.0},
                {9.5, 9.0, 8.0, 8.5, 9.0},
                {6.0, 5.5, 6.5, 7.0, 6.0},
                {8.0, 7.5, 8.5, 9.0, 8.5}
        };

        int[] credits = {3, 4, 3, 2, 4};

        int totalCredits = 0;
        for (int credit : credits) {
            totalCredits += credit;
        }

        for (int i = 0; i < gradePoints.length; i++) {
            double weightedSum = 0;
            for (int j = 0; j < gradePoints[i].length; j++) {
                weightedSum += gradePoints[i][j] * credits[j];
            }
            double cgpa = weightedSum / totalCredits;
            System.out.printf("Student %d CGPA: %.2f%n", i + 1, cgpa);
        }
    }
}
