public class Staircase {
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    row += " ";
                } else {
                    row += "#";
                }
            }
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }
}