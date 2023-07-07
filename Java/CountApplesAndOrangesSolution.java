import java.util.Arrays;

public class CountApplesAndOrangesSolution {
        public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
                long appleCount = Arrays.stream(apples)
                                .filter(x -> a + x >= s && a + x <= t)
                                .count();

                long orangeCount = Arrays.stream(oranges)
                                .filter(x -> b + x <= t && b + x >= s)
                                .count();

                System.out.println(appleCount);
                System.out.println(orangeCount);
        }
}