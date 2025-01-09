import java.util.HashMap;
import java.util.Map;

public class a43_Map {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aditya", 47);
        students.put("Pearl", 55);
        students.put("Aditya", 67);

        System.out.println(students.get("Aditya"));

        for (String key : students.keySet()) {
            System.out.println(key + "->" + students.get(key));
        }

    };
}

// Hash table is syncronised and hashmap is not syncronised