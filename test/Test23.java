import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test23 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        Integer[] arr = {10, 20, 30, 40, 50};
        for (int a: arr) {
            map.put(a, i);
            i++;
        } 

        for (Integer key: map.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        for (Integer value: map.values()) {
            System.out.println(value);
        }

        System.out.println();

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println("" + entry.getKey() + entry.getValue());
        }
        
    }
}
