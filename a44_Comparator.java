import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class a44_Comparator {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i.intValue() % 10 > j.intValue() % 10) {
                    return 1;
                }
                return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(92);
        nums.add(10);
        nums.add(178);

        Collections.sort(nums, com);
        System.out.println(nums);

    }
}
