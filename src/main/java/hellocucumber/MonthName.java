package hellocucumber;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Optional;

public class MonthName {

    static Optional<String> ofMonthNumber(int monthNumber) {
        return Optional.of(Month.of(monthNumber).getDisplayName(TextStyle.FULL, Locale.getDefault()));
    }
}
