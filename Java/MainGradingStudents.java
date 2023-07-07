import java.util.*;

public class MainGradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> finalGrades = gradingStudents(grades);
        System.out.println(finalGrades);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int diff = (int) Math.ceil(grades.get(i) / 5.0) * 5 - grades.get(i);
            if (diff < 3 && grades.get(i) >= 38) {
                finalGrades.add((int) Math.ceil(grades.get(i) / 5.0) * 5);
            } else {
                finalGrades.add(grades.get(i));
            }
        }
        return finalGrades;
    }
}