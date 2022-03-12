package Java;

import java.time.LocalDate;
import java.util.Scanner;

class Result {
    public String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().toString();
    }
}

class DateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();
        Result res = new Result();
        System.out.println(res.findDay(month, day, year));
    }
}
