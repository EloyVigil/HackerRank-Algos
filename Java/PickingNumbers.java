import java.util.*;

public class PickingNumbers {
    public static int pickingNumbers(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            List<Integer> subArr = new ArrayList<>();
            for (int j = 0; j < a.length; j++) {
                if (a[i] - a[j] == 0 || a[i] - a[j] == 1)
                    subArr.add(a[j]);
            }
            if (subArr.size() > max)
                max = subArr.size();
        }
        return max;
    }

    public static void main(String[] args) {
        List<TestCase> testCases = Arrays.asList(
                new TestCase(new int[]{1, 2, 2, 3, 1, 2}, 5),
                new TestCase(new int[]{4, 6, 5, 3, 3, 1}, 3),
                new TestCase(new int[]{1, 1, 2, 2, 4, 4, 5, 5, 5}, 5),
                new TestCase(new int[]{1, 2, 3, 4, 5}, 2)
                // Add more test cases if needed
        );

        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            int result = pickingNumbers(testCase.input);

            System.out.println("Test Case " + (i + 1));
            System.out.println("Input: " + Arrays.toString(testCase.input));
            System.out.println("Expected: " + testCase.expected);
            System.out.println("Result: " + result);
            System.out.println("Pass: " + (result == testCase.expected ? "Yes" : "No"));
            System.out.println("--------------------------------");
        }
    }

    static class TestCase {
        int[] input;
        int expected;

        public TestCase(int[] input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }
}
