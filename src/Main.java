import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static String getDateDifferenceInDDMMYYYY(Date from, Date to) {
        Calendar fromDate = Calendar.getInstance();
        Calendar toDate = Calendar.getInstance();
        fromDate.setTime(from);
        toDate.setTime(to);
        int increment = 0;
        int year, month, day;

         // System.out.print statements left in code for debugging.. This code wou;d be removed when the
         // program would be moved to Production
         // System.out.println("0 Max Day " + fromDate.getActualMaximum(Calendar.DAY_OF_MONTH));
         //  System.out.println("0.5 from date  " + fromDate.getTime());
         // System.out.println("0.5 to date  " + toDate.getTime());

         // Calculate Day, Month and Year
        if (fromDate.get(Calendar.DAY_OF_MONTH) > toDate.get(Calendar.DAY_OF_MONTH)) {
            // System.out.println("1 from day = " + fromDate.get(Calendar.DAY_OF_MONTH));
            increment = fromDate.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        // System.out.println("A= " + fromDate.get(Calendar.DAY_OF_MONTH));
        // System.out.println("B= " + toDate.get(Calendar.DAY_OF_MONTH));
        // System.out.println("increment " + increment);

        // DAY CALCULATION
        if (increment != 0) {
            // day = (toDate.get(Calendar.DAY_OF_MONTH) + increment) - fromDate.get(Calendar.DAY_OF_MONTH);
            day = (toDate.get(Calendar.DAY_OF_MONTH)  - fromDate.get(Calendar.DAY_OF_MONTH));
            // System.out.println("2= " + toDate.get(Calendar.DAY_OF_MONTH));
            // System.out.println("3= " + fromDate.get(Calendar.DAY_OF_MONTH));
            // System.out.println("3.5= " + day);
            increment = 1;
        } else {
            day = (toDate.get(Calendar.DAY_OF_MONTH) - fromDate.get(Calendar.DAY_OF_MONTH));
            // System.out.println("4= " + toDate.get(Calendar.DAY_OF_MONTH));
            // System.out.println("5= " + fromDate.get(Calendar.DAY_OF_MONTH));
            // System.out.println("7 Day " + day);
        }

        // MONTH CALCULATION
        // System.out.println("A= " + toDate.get(Calendar.MONTH));
        // System.out.println("B= " + fromDate.get(Calendar.MONTH));

        if ((fromDate.get(Calendar.MONTH) + increment) > toDate.get(Calendar.MONTH)) {
            month = (fromDate.get(Calendar.MONTH)) - ((toDate.get(Calendar.MONTH)));
            // System.out.println("8= " + toDate.get(Calendar.MONTH));
            // System.out.println("9= " + fromDate.get(Calendar.MONTH));
            // System.out.println("10 Incre " + increment);
            // System.out.println("11 month " + month);
            increment = 1;
        } else {
            // month = ((toDate.get(Calendar.MONTH)) - (fromDate.get(Calendar.MONTH)) + increment);
            month = ((toDate.get(Calendar.MONTH)) - (fromDate.get(Calendar.MONTH)));
            // System.out.println("12= " + toDate.get(Calendar.MONTH));
            // System.out.println("13= " + fromDate.get(Calendar.MONTH));
            // System.out.println("14 Incre " + increment);
            // System.out.println("15 Day " + month);
            increment = 0;
        }

        // YEAR CALCULATION
        // year = toDate.get(Calendar.YEAR) - (fromDate.get(Calendar.YEAR) + increment);
        year = toDate.get(Calendar.YEAR) - (fromDate.get(Calendar.YEAR));
        // System.out.println("16= " + toDate.get(Calendar.YEAR));
        // System.out.println("17= " + fromDate.get(Calendar.YEAR));
        // System.out.println("18= " + year);
        return year + "\tYears\t\t" + month + "\tMonths\t\t" + day + "\tDays";
    }

    public static void main(String[] args) {

        int inputYear1 = 0;
        int inputMonth1 = 0;
        int inputDay1 = 0;

        int inputYear2 = 2014;
        int inputMonth2 = 7;
        int inputDay2 = 14;

        Boolean validYear = false;
        Boolean validMonth = false;
        Boolean validDay = false;

        Scanner scnr = new Scanner(System.in);
        System.out.println("get User input values for Year, Month, Day for the First Date");

        // Get User Input - Year, Month, Day until date is valid for Input Date 1
        while (validYear != true) {
            System.out.println("Enter a Year between 1500 and 4000 (YYYY): ");
            inputYear1 = scnr.nextInt();
            if ((inputYear1 < 1500) || (inputYear1 > 4000)) {
                validYear = false;
            } else {
                validYear = true;
            }
        }

        while (validMonth != true) {
            System.out.println("Enter a Month between 0 (January) and 11 (December) (MM): ");
            inputMonth1 = scnr.nextInt();
            if ((inputMonth1 < 0) || (inputMonth1 > 11)) {
                validMonth = false;
            } else {
                validMonth = true;
            }
        }

        while (validDay != true) {
            System.out.println("Enter a Day between 1 and 31 (DD): ");
            inputDay1 = scnr.nextInt();
            if ((inputDay1 < 0) || (inputDay1 > 31)) {
                validDay = false;
            } else {
                validDay = true;
            }
        }

        // Get User Input - Year, Month, Day until date is valid for Input Date 2

        System.out.println();
        System.out.println("get User input values for Year, Month, Day for the Second Date");

        validYear = false;
        validMonth = false;
        validDay = false;

        while (validYear != true) {
            System.out.println("Enter a Year between 1500 and 4000 (YYYY): ");
            inputYear2 = scnr.nextInt();
            if ((inputYear2 < 1500) || (inputYear2 > 4000)) {
                validYear = false;
            } else {
                validYear = true;
            }
        }

        while (validMonth != true) {
            System.out.println("Enter a Month between 0 (January) and 11 (December) (MM): ");
            inputMonth2 = scnr.nextInt();
            if ((inputMonth2 < 0) || (inputMonth2 > 11)) {
                validMonth = false;
            } else {
                validMonth = true;
            }
        }

        while (validDay != true) {
            System.out.println("Enter a Day between 1 and 31 (DD): ");
            inputDay2 = scnr.nextInt();
            if ((inputDay2 < 0) || (inputDay2 > 31)) {
                validDay = false;
            } else {
                validDay = true;
            }
        }
        System.out.println();
        // System.out.println("M1 Year = "+inputYear1 +" Month = "+inputMonth1 +" Day = "+inputDay1);
        LocalDate firstDate = LocalDate.of(inputYear1, inputMonth1, inputDay1);
        // System.out.println("M2 New date = " + firstDate);

        // System.out.println("M2 Year = "+inputYear2 +" Month = "+inputMonth2 +" Day = "+inputDay2);
        LocalDate secondDate = LocalDate.of(inputYear2, inputMonth2, inputDay2);
        // System.out.println("M2 New date = " + secondDate);

        Calendar fromCalendar = Calendar.getInstance();
        Calendar toCalendar = Calendar.getInstance();

        // calendar.set(2000, 01, 20);
        fromCalendar.set(inputYear1, inputMonth1, inputDay1);
        System.out.println("From Date = " + fromCalendar.getTime());

        toCalendar.set(inputYear2, inputMonth2, inputDay2);
        System.out.println("To Date = " + toCalendar.getTime());

        // System.out.println(" today = " + today);
        // System.out.println("Call = " + getDateDifferenceInDDMMYYYY(calendar.getTime(), new Date()));
        // System.out.println("M5 Date from = " + fromCalendar.getTime());
        // System.out.println("M6 Date to = " + toCalendar.getTime());
        System.out.println();
        System.out.println("Date difference = " + getDateDifferenceInDDMMYYYY(fromCalendar.getTime(), toCalendar.getTime()));
    }
  }
