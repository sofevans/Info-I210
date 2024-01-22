import java.util.GregorianCalendar;

public class Calender {
    public static void main(String[] args) {
        java.util.GregorianCalendar month = new java.util.GregorianCalendar();
        java.util.GregorianCalendar day = new java.util.GregorianCalendar();
        java.util.GregorianCalendar year = new java.util.GregorianCalendar();
        int n = month.get(GregorianCalendar.MONTH);
        CalenderA calndr1 = new CalenderA();
        System.out.println("The current date is " +
                year.get(GregorianCalendar.YEAR) + " " +
                calndr1.getMonth() + " " + 
                day.get(GregorianCalendar.DAY_OF_MONTH));
        
        CalenderA calndr2 = new CalenderA(1234567898765L);
        System.out.println("The current date is " +
                year.get(GregorianCalendar.YEAR) + " " +
                calndr2.getMonth() + " " + 
                day.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
class CalenderA{
    long a;
    int m = 1;
    CalenderA() {
        a = 1;
    }
    CalenderA(long b) {
        a = b;
    }
    String getMonth() {
        String result = "A";
        switch(m) {
            case 1:
                result = "Jan";
                break;
            case 2:
                result = "Feb";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "Apr";
                break;
            case 5:
                result = "May";
                break;    
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "Aug";
                break;
            case 9:
                result = "Sept";
                break;
            case 10:
                result = "Oct";
                break;
            case 11:
                result = "Nov";
                break;
            case 12:
                result = "Dec";
                break;
        }
        return result;
    }
    void setTimeInMillis(long b){
        a = b;
    }
}
