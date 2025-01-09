import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a45_PracticeSort {
    public static void main(String[] args) {

        Comparator<String> cmp = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1;
                } else if (i.length() == j.length() && i.compareTo(j) > 0)
                    return 1;
                return -1;

            }
        };

        List<String> str = new ArrayList<>();
        str.add("Aditya");
        str.add("Pearl");
        str.add("Ashish");

        Collections.sort(str, cmp);
        System.out.println(str);

    }

}