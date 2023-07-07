import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        miniMaxSum(arr);
    }
    
    private static void miniMaxSum(int[] arr) {
        int minSum = 0;
        int maxSum = 0;
        int length = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                minSum += arr[i];
            }
            if (i > 0) {
                maxSum += arr[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }
}