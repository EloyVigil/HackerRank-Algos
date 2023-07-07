import java.util.Arrays;

public class BillDivision {
    public static Object bonAppetit(int[] bill, int k, int b) {
        int billTotal = Arrays.stream(bill).sum();
        int annasBill = (billTotal - bill[k]) / 2;
        int annasChange = bill[k] / 2;

        if (annasBill == b) {
            return "Bon Appetit";
        } else {
            return annasChange;
        }
    }

    public static void main(String[] args) {
        int[] bill1 = {3, 10, 2, 9};
        int k1 = 1;
        int b1 = 12;
        System.out.println(bonAppetit(bill1, k1, b1)); // should print 5

        int[] bill2 = {3, 10, 2, 9};
        int k2 = 1;
        int b2 = 7;
        System.out.println(bonAppetit(bill2, k2, b2)); // should print "Bon Appetit"
    }
}


