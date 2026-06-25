import java.util.HashMap;

public class NoRepeatSubString {
    public int noRepeat(char[] seq){
        int low = 0, res = -1;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int high = 0; high < seq.length; high++){
            if(hm.containsKey(seq[high])){
                hm.put(seq[high], hm.get(seq) + 1);
            }else{
                hm.put(seq[high], 1);
            }
            int k = high - low + 1;
            while(hm.size() < k){
                hm.put(seq[low], hm.get(seq[low]) - 1);
                if(hm.get(seq[low]) == 0){
                    hm.remove(seq[low]);
                }
                low++;
                k = high - low + 1;
            }
            if(hm.size() == k){
                res = Math.max(res, k);
            }
        }
        return res;
    }
    public static void main(String[] args){
        NoRepeatSubString nrss = new NoRepeatSubString();
        nrss.noRepeat(new char[]{'a', 'b', 'c', 'a', 'c', 'b'});
    }
}
