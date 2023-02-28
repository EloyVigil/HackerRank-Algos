import java.util.*;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdsMap = new HashMap<>();
        for (Integer birdType : arr) {
            Integer count = birdsMap.get(birdType);
            if (count == null) {
                count = 0;
            }
            birdsMap.put(birdType, count + 1);
        }

        Optional<Map.Entry<Integer, Integer>> maxEntry =
            birdsMap.entrySet().stream()
            .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            return maxEntry.get().getKey();
        } else {
            throw new IllegalStateException("No birds found");
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 3, 3);
        int result = migratoryBirds(arr);
        System.out.println(result); // expected output: 3
    }
}
