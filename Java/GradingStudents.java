import java.util.*;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int length = grades.size();
        List<Integer> finalGrade = new ArrayList<Integer>();
        
        for (int i = 0; i < length; i++) {
            int diff = (int) Math.ceil(grades.get(i) / 5.0) * 5 - grades.get(i);
            if (diff < 3 && grades.get(i) >= 38) {
                finalGrade.add((int) Math.ceil(grades.get(i) / 5.0) * 5);
            } else {
                finalGrade.add(grades.get(i));
            }
        }
        return finalGrade;
    }
    
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        List<Integer> finalGrade = gradingStudents(grades);
        System.out.println(finalGrade);
    }
}