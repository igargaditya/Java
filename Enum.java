enum Day {
    Monday("Weekday"), Tuesday("Weekday"), Wednesday("Weekday"), Thursday("Weekday"), Friday("Weekday"),
    Saturday("Weekend"), Sunday("Weekend");

    private String whichday;

    private Day(String whichday) {
        System.out.println("called");
        this.whichday = whichday;
    }

    public String getwhichday() {
        return whichday;
    }

    public void display() {
        System.out.println("Today is " + this.name());
    }
}

public class Enum {

    public enum Weight {
        Lightweight, Heavyweight
    }

    public static void main(String[] args) {

        // Creating instance of Monday from Day
        Day monday = Day.Monday;

        // Whenever print Day then tostring() is called
        System.out.println(monday);

        int ordinal = Day.Tuesday.ordinal();
        System.out.println(ordinal);
        System.out.println(monday.toString());

        // If value is present then that value is given
        Day enumpresent = Day.valueOf("Tuesday");
        System.out.println(enumpresent);

        // Day[] enums = Day.values();
        // for (Day i : enums) {
        // System.out.println(i);
        // }
        System.out.println(Day.Wednesday);
        System.out.println(Day.Thursday.getwhichday());
        System.out.println(Weight.Heavyweight);
    }
}
