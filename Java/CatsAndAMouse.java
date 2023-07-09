import java.util.function.Function;

public class CatsAndAMouse {

    static class Pair<A, B> {
        A first;
        B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        A getFirst() {
            return first;
        }

        B getSecond() {
            return second;
        }
    }

    public static String catAndMouse(Object input) {
        if (input instanceof Pair<?, ?>) {
            Pair<?, ?> pair = (Pair<?, ?>) input;
            Object innerPair = pair.getFirst();
            Double z = (Double) pair.getSecond();

            if (innerPair instanceof Pair<?, ?>) {
                Pair<?, ?> catPositions = (Pair<?, ?>) innerPair;
                Integer x = (Integer) catPositions.getFirst();
                Integer y = (Integer) catPositions.getSecond();

                double catA = Math.abs(z - x);
                double catB = Math.abs(z - y);

                if (catA < catB) {
                    return "Cat A";
                } else if (catA > catB) {
                    return "Cat B";
                } else {
                    return "Mouse C";
                }
            }
        }

        return null;
    }

    public static void testCatAndMouse(Function<Object, String> catAndMouse) {
        // Test case 1: Cat A is closer to the mouse
        String result = catAndMouse.apply(new Pair<>(new Pair<>(1, 4), 2.0));
        assert result.equals("Cat A") : "Test case 1 failed";
        if (result.equals("Cat A")) {
            System.out.println("Test 1 Passed");
        }

        // Test case 2: Cat B is closer to the mouse
        result = catAndMouse.apply(new Pair<>(new Pair<>(1, 4), 3.0));
        assert result.equals("Cat B") : "Test case 2 failed";
        if (result.equals("Cat B")) {
            System.out.println("Test 2 Passed");
        }

        // Test case 3: Both cats are equidistant from the mouse
        result = catAndMouse.apply(new Pair<>(new Pair<>(1, 4), 2.5));
        assert result.equals("Mouse C") : "Test case 3 failed";
        if (result.equals("Mouse C")) {
            System.out.println("Test 3 Passed");
        }

        // Test case 4: Cat A and Cat B are equidistant from the mouse
        result = catAndMouse.apply(new Pair<>(new Pair<>(1, 3), 2.0));
        assert result.equals("Mouse C") : "Test case 4 failed";
        if (result.equals("Mouse C")) {
            System.out.println("Test 4 Passed");
        }

        // Test case 5: Cat A and Cat B are at the same position as the mouse
        result = catAndMouse.apply(new Pair<>(new Pair<>(1, 1), 1.0));
        assert result.equals("Mouse C") : "Test case 5 failed";
        if (result.equals("Mouse C")) {
            System.out.println("Test 5 Passed");
        }
    }
}