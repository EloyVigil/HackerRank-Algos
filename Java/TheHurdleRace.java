import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        int potions = 0;

        height.sort(Integer::compareTo);

        if (height.get(height.size() - 1) >= k) {
            potions = height.get(height.size() - 1) - k;
        }

        return potions;
    }

    public static void testHurdleRace() {
        List<TestCase> testCases = Arrays.asList(
                new TestCase(4, Arrays.asList(1, 6, 3, 5, 2), 2),
                new TestCase(7, Arrays.asList(2, 5, 4, 8, 9), 2),
                new TestCase(3, Arrays.asList(4, 2, 7, 6, 5), 4),
                new TestCase(10, Arrays.asList(11, 12, 9, 8, 15), 5),
                new TestCase(5, Arrays.asList(7, 5, 5, 6, 8), 3));

        for (TestCase testCase : testCases) {
            int result = hurdleRace(testCase.k, testCase.height);
            boolean pass = result == testCase.expected;
            System.out.println("Test Case: k=" + testCase.k + ", height=" + testCase.height +
                    ", Expected: " + testCase.expected + ", Result: " + result +
                    ", Pass: " + (pass ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        testHurdleRace();
    }
}

class TestCase {
    int k;
    List<Integer> height;
    int expected;

    public TestCase(int k, List<Integer> height, int expected) {
        this.k = k;
        this.height = height;
        this.expected = expected;
    }
}
