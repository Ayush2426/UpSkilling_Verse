package Amazon;

public class MinWinSubstring {
    public String findMinString(String s, String t){
        if(s == null || t == null || s.length() < t.length()) return "";

        int[] need = new int[128];
        for(char c : t.toCharArray()) need[c]++;

        int required = t.length();
        int l = 0, minLen = Integer.MAX_VALUE, minStart = 0;

        for(int r = 0; r < s.length(); r++){
            char rc = s.charAt(r);
            if(need[rc] > 0) required--;
            need[rc]--;

            while(required == 0){
                if(r - l + 1 < minLen){
                    minLen = r - l + 1;
                    minStart = l;
                }

                char lc = s.charAt(l);
                need[lc]++;
                if(need[lc] > 0) required++;
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
