import java.util.*;
import java.text.*;

public class DayDiffCalculator {


    public static void main(String[] args) {
        int days = new DayDiffCalculator().calculate("2017-01-01", "2017-01-03");
        System.out.println(days);
    }

    public int calculate(String firstDate, String seconddate) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");//, Locale.ENGLISH);
        int days = 0;
        try {
            Date endDate = format.parse(firstDate);
            Date startDate = format.parse(seconddate);
            long diff = startDate.getTime() - endDate.getTime();
            days = (int) (diff / (1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
