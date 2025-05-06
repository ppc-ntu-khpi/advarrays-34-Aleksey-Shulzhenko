import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * MatrixAnalyzer — клас для пошуку елемента, який повторюється найбільше у матриці.
 */
public class MatrixAnalyzer {

    /**
     * Повертає число, яке зустрічається найчастіше в матриці.
     *
     * @param matrix Двовимірна матриця цілих чисел
     * @return Найчастіше повторюване число
     * @throws IllegalArgumentException якщо матриця порожня або null
     */
    public static int findMostFrequentNumber(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожньою.");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        Arrays.stream(matrix)
              .flatMapToInt(Arrays::stream)
              .forEach(num -> frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1));

        return frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}
