import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class a48_Stream {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(9, 234, 21, 22, 3);

        // s1.forEach(n -> System.out.println(n)); // Can be only used once
        // USED TO DOUBLE THE EVEN NUMBER AND SUM IT
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (c, e) -> c + e);
        System.out.println(result);

        // Another way
        int ans = nums.stream().filter(n -> n % 2 == 1).map(n -> n * 2).reduce(0, (c, e) -> c + e);
        System.out.println(ans);

    }
}
