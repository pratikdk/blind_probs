import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/minimum-window-substring/discuss/26808/Here-is-a-10-line-template-that-can-solve-most-'substring'-problems

public class P76_MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int[] map = new int[128];
        for (int i = 0; i < t.length(); i++) {
            map[t.charAt(i)]++;
        }
        int counter = t.length();
        int start = 0, end = 0;
        int wSize = Integer.MAX_VALUE;
        int head = 0;

        while (end < s.length()) {
            if (map[s.charAt(end++)]-- > 0) { counter--; }
            while (counter == 0) {
                if (end-start < wSize) {
                    head = start;
                    wSize = end-start;
                }
                if (map[s.charAt(start++)]++ == 0) { counter++; }
            }
        }
        return (wSize == Integer.MAX_VALUE) ? "" : s.substring(head, head+wSize);
    }
    public static void main(String[] args) {
        String[][] probs = {
            {"ADOBECODEBANC", "ABC"},
            {"a", "a"},
            {"a", "aa"}
        };
        for (String[] prob: probs) {
            System.out.println(minWindow(prob[0], prob[1]));
        }
    }
}
