public class ElectronicsShop {
    public static int getMaxPurchase(int[] keyboards, int[] drives, int budget) {
        int maxTotal = -1;

        for (int k : keyboards) {
            for (int d : drives) {
                int total = k + d;
                if (total <= budget && total > maxTotal) {
                    maxTotal = total;
                }
            }
        }

        return maxTotal;
    }

    public static void main(String[] args) {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int budget = 10;
        int expected = 9;

        int result = ElectronicsShop.getMaxPurchase(keyboards, drives, budget);

        System.out.println(result == expected ? "Test passed" : "Test failed");
    }
}



