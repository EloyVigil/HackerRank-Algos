import java.util.*;


public class MigratoryBirds {
    public static int migratoryBirds(int[] arr) {
        Map<Integer, Integer> birdsMap = new HashMap<>();
        Arrays.stream(arr).forEach(birdType -> birdsMap.put(birdType, birdsMap.getOrDefault(birdType, 0) + 1));

        int lowestType = Integer.MAX_VALUE;
        int highestCount = 0;
        for (int birdType : birdsMap.keySet()) {
            int count = birdsMap.get(birdType);
            if (count > highestCount || (count == highestCount && birdType < lowestType)) {
                highestCount = count;
                lowestType = birdType;
            }
        }

        return lowestType;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 8, 8, 2, 6, 5, 2, 9};
        System.out.println(migratoryBirds(arr1)); // output: 2

        int[] arr2 = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        System.out.println(migratoryBirds(arr2)); // output: 1
    }
}