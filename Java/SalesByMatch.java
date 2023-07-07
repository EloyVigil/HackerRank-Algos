

public class SalesByMatch {
    private final int n;
    private final int[] ar;

    public SalesByMatch(int n, int[] ar) {
        this.n = n;
        this.ar = ar;
    }

    public int countPairs() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (ar[j] == -1) {
                    continue;
                }
                if (ar[i] == ar[j]) {
                    count++;
                    ar[i] = -1;
                    ar[j] = -1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        SalesByMatch sales = new SalesByMatch(ar.length, ar);
        int pairs = sales.countPairs();
        System.out.println(pairs); // output: 3
    }
}
