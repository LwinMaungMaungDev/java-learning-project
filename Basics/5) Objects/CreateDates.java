import java.util.Date;

class CreateDates {
    
    public static void main (String args[]) {
        Date d1, d2, d3;

        d1 = new Date();
        System.out.println("Date 1: " + d1);

        d2 = new Date(71, 7, 1, 7, 30); // year, month, day, hours, and seconds
        System.out.println("Date 2: " + d2);

        d3 = new Date("April 3 1993 3:24 PM");
        System.out.println("Date 3: " + d3);
    }
}