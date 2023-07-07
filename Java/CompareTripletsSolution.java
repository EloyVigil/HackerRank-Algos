import java.util.*;

public class CompareTripletsSolution {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> solution = Arrays.asList(0, 0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                solution.set(1, solution.get(1) + 1);
            } else if (a.get(i) > b.get(i)) {
                solution.set(0, solution.get(0) + 1);
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1)));
        System.out.println(compareTriplets(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)));
        System.out.println(compareTriplets(Arrays.asList(19, 20, 30), Arrays.asList(30, 22, 30)));
    }
}
