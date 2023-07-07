

public class BirthdayCakeCandlesSolution {
    public static int birthdayCakeCandles(int[] candles) {
        int maxAge = 0;
        int candleCount = 0;

        for (int i = 0; i < candles.length; i++) {
            if (candles[i] < maxAge) {
                continue;
            }
            if (candles[i] > maxAge) {
                maxAge = candles[i];
                candleCount = 1;
            } else if (candles[i] == maxAge) {
                candleCount++;
            }
        }

        return candleCount;
    }

    public static void main(String[] args) {
        int[] candles = {3, 2, 1, 3};
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }
}
