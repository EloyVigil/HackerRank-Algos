public class DrawingBook {
    public static int pageCount(int n, int p) {
        int frontFlip = (int) Math.floor(p / 2);
        int backFlip = (int) Math.floor((n / 2) - frontFlip);

        int result = Math.min(frontFlip, backFlip);
        return result;
    }
    
    public static void main(String[] args) {
        // Test Cases
        System.out.println(pageCount(5, 3)); // expected output: 1
        System.out.println(pageCount(9, 5)); // expected output: 2
    }
}