// https://leetcode.com/problems/minimum-window-substring/discuss/26808/Here-is-a-10-line-template-that-can-solve-most-'substring'-problems

public class P3_LongestSubstringWithoutRepeatingCharacter_sol2 {

    public static int longestSubstring(String s) {
        int[] map = new int[128];
        int counter = 0;
        int start = 0, end = 0;
        int wSize = 0;
        while (end < s.length()) {
            if (map[s.charAt(end++)]++ > 0) { counter++; }
            while (counter > 0) {
                if (map[s.charAt(start++)]-- > 1) { counter--; }
            }
            wSize = Math.max(wSize, end-start);
        }
        return wSize;
    }
    public static void main(String[] args) {
        String[] probs = {
            "daaabbbc",
            "abcd",
            "aaaab"
        };
        for (String s: probs) {
            System.out.println(longestSubstring(s));
        }
    }
}
