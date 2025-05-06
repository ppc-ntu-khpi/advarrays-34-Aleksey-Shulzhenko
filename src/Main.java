import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 1, 2},
            {5, 3, 4},
            {5, 6, 7}
        };

        int result = MatrixAnalyzer.findMostFrequentNumber(matrix);
        System.out.println("Найчастіше число в матриці: " + result); // Очікується: 5
    }
}
