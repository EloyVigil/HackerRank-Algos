public class DiagonalDifference {
    public static int calculate(int[][] arr) {
        int difference = 0;
        int l = arr.length;
        int primary = 0;
        int secondary = 0;

        for(int i = 0; i < l; i++) {
            primary += arr[i][i];
            secondary += arr[l - 1 - i][i];
        }

        System.out.println("primary " + primary);
        System.out.println("secondary " + secondary);

        difference = secondary - primary;
        return Math.abs(difference);
    }

    public static void main(String[] args) {
        int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        System.out.println(calculate(arr));
    }
}