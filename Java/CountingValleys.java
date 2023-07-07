public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int elevation = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                elevation--;
            } else {
                if (elevation == -1) {
                    valleys++;
                }
                elevation++;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        int result1 = countingValleys(8, "UDDDUDUU");
        int result2 = countingValleys(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD");

        System.out.println("Test 1 Result: " + result1);
        System.out.println("Test 2 Result: " + result2);
    }
}