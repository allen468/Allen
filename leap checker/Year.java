public class Year{
    public static void main(String[] args) {
        int startYear = 2010;
        int endYear = 2020;
        int leapYearCount = 0;
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                leapYearCount++;
            }
        }

        System.out.println("Number of leap years between " + startYear + " and " + endYear + ": " + leapYearCount);
    }
    public static boolean isLeapYear(int year); 
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
