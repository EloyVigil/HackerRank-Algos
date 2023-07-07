public class TimeConversion {
    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String timeFormat = s.substring(2, 8);

        if (hour == 12 && s.contains("AM")) {
            return "00" + timeFormat;
        } else if (hour == 12 && s.contains("PM")) {
            return hour + timeFormat;
        } else if (hour < 12 && s.contains("PM")) {
            return (hour + 12) + timeFormat;
        } else {
            if (hour < 10) {
                return "0" + hour + timeFormat;
            } else {
                return hour + timeFormat;
            }
        }
    }

    public static void main(String[] args) {
        String time = "07:05:45PM";
        System.out.println(timeConversion(time));  // Output: "19:05:45"
    }
}


