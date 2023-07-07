import java.util.Arrays;
import java.util.List;

public class FormingMagicSquare {
    public static int formingMagicSquare(int[][] s) {
        List<int[][]> possibleCases = Arrays.asList(
            new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            new int[][]{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            new int[][]{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            new int[][]{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            new int[][]{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
        );

        int min = 45;
        for (int[][] square : possibleCases) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum += Math.abs(s[i][j] - square[i][j]);
                }
            }
            if (sum < min) {
                min = sum;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] input1 = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 5}
        };
        int[][] input2 = {
            {4, 8, 2},
            {4, 5, 7},
            {6, 1, 6}
        };

        int expectedOutput1 = 1;
        int expectedOutput2 = 4;

        int output1 = formingMagicSquare(input1);
        int output2 = formingMagicSquare(input2);

        System.out.println("Test Case 1");
        System.out.println("Input: " + Arrays.deepToString(input1));
        System.out.println("Expected Output: " + expectedOutput1);
        System.out.println("Actual Output: " + output1);
        System.out.println("--------------------------------------------------");

        System.out.println("Test Case 2");
        System.out.println("Input: " + Arrays.deepToString(input2));
        System.out.println("Expected Output: " + expectedOutput2);
        System.out.println("Actual Output: " + output2);
        System.out.println("--------------------------------------------------");
    }
}
