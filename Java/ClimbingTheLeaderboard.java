import java.util.*;

public class ClimbingTheLeaderboard {
    public static List<Integer> climbingTheLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> cleanRanks = new ArrayList<>(new LinkedHashSet<>(ranked));
        cleanRanks.sort(Integer::compareTo);
        List<Integer> playerRank = new ArrayList<>();
        int len = cleanRanks.size();

        for (int i = 0; i < player.size(); i++) {
            int rank = len + 1;
            int j = 0;

            while (len > 0 && player.get(i) >= cleanRanks.get(j)) {
                rank--;
                j++;
            }

            playerRank.add(rank);
        }

        return playerRank;
    }

    public static void main(String[] args) {
        List<Map<String, List<Integer>>> testCases = new ArrayList<>();

        Map<String, List<Integer>> testCase1 = new HashMap<>();
        testCase1.put("ranked", Arrays.asList(100, 90, 90, 80, 75, 60));
        testCase1.put("player", Arrays.asList(50, 65, 77, 90, 102));
        testCase1.put("expected", Arrays.asList(6, 5, 4, 2, 1));
        testCases.add(testCase1);

        Map<String, List<Integer>> testCase2 = new HashMap<>();
        testCase2.put("ranked", Arrays.asList(100, 100, 50, 40, 20, 10));
        testCase2.put("player", Arrays.asList(5, 15, 25, 50, 120));
        testCase2.put("expected", Arrays.asList(6, 5, 4, 2, 1));
        testCases.add(testCase2);

        // Add more test cases if needed

        for (int i = 0; i < testCases.size(); i++) {
            Map<String, List<Integer>> testCase = testCases.get(i);
            List<Integer> ranked = testCase.get("ranked");
            List<Integer> player = testCase.get("player");
            List<Integer> expected = testCase.get("expected");

            List<Integer> result = climbingTheLeaderboard(ranked, player);

            System.out.println("Test Case " + (i + 1));
            System.out.println("Ranked: " + ranked);
            System.out.println("Player: " + player);
            System.out.println("Expected: " + expected);
            System.out.println("Result: " + result);
            System.out.println("Pass: " + (result.equals(expected) ? "Yes" : "No"));
            System.out.println("--------------------------------");
        }
    }
}