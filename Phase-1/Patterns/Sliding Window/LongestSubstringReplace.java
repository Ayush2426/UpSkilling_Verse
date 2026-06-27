
public class LongestSubstringReplace {

    public int findLSR(String s, int k) {
        int low = 0, res = -1, maxLen = -1;
        int[] arr = new int[26];

        for (int high = 0; high < s.length(); high++) {
            arr[s.charAt(high) - 'A']++;
            maxLen = Math.max(maxLen, arr[s.charAt(high) - 'A']);

            while (((high - low + 1) - maxLen) > k) {
                arr[s.charAt(low) - 'A']--;
                low++;
            }
            res = Math.max(high - low + 1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        LongestSubstringReplace lsr = new LongestSubstringReplace();
        lsr.findLSR("ABABABA", 2);
    }
}
