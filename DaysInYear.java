public class DaysInYear {
    public static void main(String[] args) {
    int y = 2000;
    System.out.println("Year     Days");
    while (y <= 2020) {
        System.out.println(y + "     " + numberOfDaysInAYear(y));
        y++;
    }
    }
    public static int numberOfDaysInAYear(int year) {
        int days = 365;
        if (year % 4 == 0)
            days = 366;
        return days;    
    }
}
