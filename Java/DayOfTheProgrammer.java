import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        LocalDate date;
        if (year == 1918) {
            // Special case for 1918
            date = LocalDate.of(year, 9, 26);
        } else if (year < 1918) {
            // Julian calendar before 1918
            date = (year % 4 == 0) ? LocalDate.of(year, 9, 12) : LocalDate.of(year, 9, 13);
        } else {
            // Gregorian calendar from 1918 onwards
            date = ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) ? LocalDate.of(year, 9, 12) : LocalDate.of(year, 9, 13);
        }
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static void main(String[] args) {
        // Test case
        int year = 2021;
        String expectedOutput = "13.09.2021";
        String actualOutput = dayOfProgrammer(year);
        System.out.println(actualOutput.equals(expectedOutput) ? "Test passed" : "Test failed");
    }
}