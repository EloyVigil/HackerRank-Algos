import java.util.Arrays;

public class AVeryBigSumSolution {
    public static void main(String[] args) {
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long sum = aVeryBigSum(ar);
        System.out.println(sum);
    }

    public static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }
}
