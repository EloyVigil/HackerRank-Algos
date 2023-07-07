import java.util.Arrays;

public class BreakingRecordsSolution {
    public static int[] breakingRecords(int[] scores) {
        int best = 0;
        int worst = 0;
        int bestScore = scores[0];
        int worstScore = scores[0];
        int length = scores.length;
        for (int i = 1; i < length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
                best++;
            }
            if (scores[i] < worstScore) {
                worstScore = scores[i];
                worst++;
            }
        }
        return new int[] {best, worst};
    }

    public static void main(String[] args) {
        int[] result1 = breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
        int[] result2 = breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
