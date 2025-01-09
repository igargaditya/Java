import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class a41_ArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(6);

        System.out.println(nums.get(1));

        System.out.println(nums.indexOf(9));
        for (Integer n : nums) {
            int value = n.intValue();
            System.out.println(value);
        }
    }
}

// Collection API is A concept and tells us we should use various inbuilt
// methods and classes

// Collection is an Interface and extends Iterator Interface
// List , Deque , Set extends Collection Interface
// Arraylist , Linkedlist Implements List Interface