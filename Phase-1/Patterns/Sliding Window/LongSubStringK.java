
import java.util.HashMap;

public class LongSubStringK {

    public int longSub(String sequence, int k) {
        char[] arr = sequence.toCharArray();
        int low = 0, res = -1;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int high = 0; high < arr.length; high++) {
            if (hm.containsKey(arr[high])) {
                hm.put(arr[high], hm.get(arr[high]) + 1);
            } else {
                hm.put(arr[high], 1);
            }
            while (hm.size() > k) {
                char leftChar = arr[low];
                hm.put(leftChar, hm.get(leftChar) - 1);
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                low++;
            }
            if (hm.size() == k) {
                res = Math.max(res, high - low + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongSubStringK lssk = new LongSubStringK();
        System.out.println(lssk.longSub("aabacbebebe", 3));
    }
}
