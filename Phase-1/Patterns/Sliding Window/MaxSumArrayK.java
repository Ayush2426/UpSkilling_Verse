
public class MaxSumArrayK {

    public int maxSumArray(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxsum = sum;

        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        MaxSumArrayK msak = new MaxSumArrayK();
        System.out.println(msak.maxSumArray(new int[]{100, 200, 300, 400}, 2));
    }
}
