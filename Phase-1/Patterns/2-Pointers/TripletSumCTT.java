
import java.util.Arrays;

public class TripletSumCTT {

    public int findTripCtt(int[] nums, int target) {
        Arrays.sort(nums);
        int max_diff = Integer.MAX_VALUE;
        int res_sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = target - sum;

                if (Math.abs(diff) < max_diff) {
                    max_diff = Math.abs(diff);
                    res_sum = sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res_sum;
    }

    public static void main(String[] args) {
        TripletSumCTT tsctt = new TripletSumCTT();
        System.out.println(tsctt.findTripCtt(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 1));
    }
}
