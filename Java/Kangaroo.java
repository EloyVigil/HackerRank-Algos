public class Kangaroo {
    public static void main(String[] args) {
        int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
        String result = canKangaroosMeet(x1, v1, x2, v2) ? "YES" : "NO";
        System.out.println(result);
    }
    
    private static boolean canKangaroosMeet(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return false;
        }
        return (x1 - x2) % (v1 - v2) == 0;
    }
}