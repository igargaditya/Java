import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class a47_Foreach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 23, 12, 11, 55, 47);

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer a) {
                System.out.println(a);
            }
        };

        nums.forEach(con);
        System.out.println();

        // We need to achieve the enhanced foreach

        nums.forEach((a) -> System.out.println(a));

    }
}