package hellocucumber;

public class IsItFriday {

    static String isItFriday(String today) {
        return switch (today) {
            case "Friday" -> "TGIF";
            case "Sunday" -> "Not, it is Sunday";
            default -> "Nope";
        };
    }
}