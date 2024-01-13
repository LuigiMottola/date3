import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //creating offset
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //recovering datas
        Integer yyyy = dateTime.getYear();
        String MMMM = dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
        Integer dd = dateTime.getDayOfMonth();
        String dayOfWeek = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        //printing
        System.out.println("Year: " + yyyy);
        System.out.println("Month: " + MMMM);
        System.out.println("Day: " + dd);
        System.out.println("Day of the week : " + dayOfWeek);





    }

}