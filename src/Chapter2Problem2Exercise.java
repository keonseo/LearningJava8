import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Chapter2Problem2Exercise {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    private static ThreadLocal<DateFormatter> threadLocalDateFormatter = ThreadLocal.withInitial(() -> new DateFormatter(sdf));

    static
    {
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String args[]) throws ParseException {
        System.out.println(threadLocalDateFormatter.get().valueToString(new Date(0)));
    }
}
