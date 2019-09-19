package hellocucumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MonthName {

    private static final Map<Integer, String> monthnames = new HashMap<Integer, String>();
    static {
        monthnames.put(1, "January");
        monthnames.put(2, "February");
        monthnames.put(3, "March");
        monthnames.put(4, "April");
        monthnames.put(5, "May");
        monthnames.put(6, "June");
        monthnames.put(7, "July");
        monthnames.put(8, "August");
        monthnames.put(9, "September");
        monthnames.put(10, "October");
        monthnames.put(11, "November");
        monthnames.put(12, "December");
    }

    static Optional<String> ofMonthNumber(int monthNumber) {
        return Optional.ofNullable(monthnames.get(monthNumber));
    }
}
