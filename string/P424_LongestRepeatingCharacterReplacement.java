public class P424_LongestRepeatingCharacterReplacement {
    
    public static int characterReplacement(String s, int k) {
        int len = s.length();
        int[] count = new int[26];
        int start = 0, maxcount = 0, maxlength = 0;
        for (int end = 0; end < len; end++) {
            maxcount = Math.max(maxcount, ++count[s.charAt(end) - 'A']);
            while (end-start+1 - maxcount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxlength = Math.max(maxlength, end-start+1);
        }
        return maxlength;
    }
    public static void main(String[] args) {
        String[][] probs = {
            {"ABAB", "2"},
            {"AABABBA", "1"}
        };
        for (String[] prob: probs) {
            System.out.println(characterReplacement(prob[0], Integer.parseInt(prob[1])));
        }
    }
}
