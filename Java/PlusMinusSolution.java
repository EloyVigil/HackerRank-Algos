
public class PlusMinusSolution {
    public static void main(String[] args) {
        int[] arr1 = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr1);

        int[] arr2 = {1, 2, 3, -1, -2, -3, 0, 0};
        plusMinus(arr2);
    }

    public static void plusMinus(int[] arr) {
        int tempNumPositive = 0;
        int tempNumNegative = 0;
        int tempNumZero = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] < 0) {
                tempNumNegative += 1;
            } else if (arr[i] > 0) {
                tempNumPositive += 1;
            } else {
                tempNumZero += 1;
            }
        }

        double positiveFraction = (double) tempNumPositive / length;
        System.out.println("Positive " + String.format("%.6f", positiveFraction));

        double negativeFraction = (double) tempNumNegative / length;
        System.out.println("Negative " + String.format("%.6f", negativeFraction));

        double zeroFraction = (double) tempNumZero / length;
        System.out.println("Zero " + String.format("%.6f", zeroFraction));
    }
}
