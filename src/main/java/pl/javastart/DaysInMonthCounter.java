package pl.javastart;

public class DaysInMonthCounter {
    int getDayCount(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
        month == 10 || month == 12) return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        if (month == 2 && isYearLeap(year)) return 29;
        if (month == 2 && !isYearLeap(year)) return 28;
        throw new IllegalArgumentException();
    }

    private boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
