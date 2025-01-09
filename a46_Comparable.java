import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Anime implements Comparable<Anime> {
    String name;
    Integer rating;

    public Anime(Integer rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public int compareTo(Anime that) {
        if (this.rating < that.rating) {
            return 1;

        }
        return -1;
    }

}

public class a46_Comparable {
    public static void main(String[] args) {
        Comparator<Anime> comp = new Comparator<Anime>() {
            public int compare(Anime i, Anime j) {
                if (i.rating > j.rating)
                    return 1;
                return -1;
            }
        };
        List<Anime> ani = new ArrayList<>();
        ani.add(new Anime(98, "Attack On Titan"));
        ani.add(new Anime(89, "One Piece"));
        ani.add(new Anime(96, "Link Click"));

        // Using Comparable
        Collections.sort(ani);
        for (Anime a : ani)
            System.out.println(a.rating + " " + a.name);

        // Using Comparator
        Collections.sort(ani, comp);
        for (Anime a : ani)
            System.out.println(a.rating + " " + a.name);

    }
}
