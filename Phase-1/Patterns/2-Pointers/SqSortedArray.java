
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SqSortedArray {

    public int[] sqSorted(int[] nums) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }
        for (int i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }
        for (int i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        int i = 0, j = 0, k = 0;
        int[] res = new int[pos.size() + neg.size()];

        while (i < pos.size() && j < neg.size()) {
            if (pos.get(i) <= neg.get(j)) {
                res[k++] = pos.get(i++);
            } else {
                res[k++] = neg.get(j++);
            }
        }

        while (i < pos.size()) {
            res[k++] = pos.get(i++);
        }

        while (j < neg.size()) {
            res[k++] = neg.get(j++);
        }

        return res;
    }

    public static void main(String[] args) {
        SqSortedArray ssa = new SqSortedArray();

        System.out.println(
                Arrays.toString(
                        ssa.sqSorted(new int[]{-3, -2, 1, 2, 3, 4, 5})
                )
        );
    }
}
