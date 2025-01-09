import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class a42_Set {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num;
            num = sc.nextInt();
            Integer num1 = num;
            nums.add(num1);
        }

        for (Integer n : nums) {
            System.out.println(n);
        }
        sc.close();
    }
}
