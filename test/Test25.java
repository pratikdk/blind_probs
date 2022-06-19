import java.lang.reflect.Array;
import java.util.*;
public class Test25 {
    public static void main(String[] args) {
        String S = "We test coders. Give us a try?";
        S = S.replaceAll("\\.|\\!|\\?", "|");
        String[] list = S.split(" ");
        System.out.println(list.length);
        List<Integer> lengthList = new ArrayList<>(Arrays.asList(1, 2, 3, 100, 3));
        Collections.max(lengthList);
    }
}
