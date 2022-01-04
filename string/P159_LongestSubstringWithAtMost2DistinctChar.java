public class P159_LongestSubstringWithAtMost2DistinctChar {
    public static int longestSubstring(String s) {
        int[] map = new int[128];
        int counter = 0;
        int start = 0, end = 0;
        int wSize = 0;
        while (end < s.length()) {
            if (map[s.charAt(end++)]++ == 0) { counter++; }
            while (counter > 2) {
                if (map[s.charAt(start++)]-- == 1) { counter--; }
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
