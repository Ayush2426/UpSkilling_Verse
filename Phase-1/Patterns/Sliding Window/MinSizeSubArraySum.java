public class MinSizeSubArraySum {
    public int minSubArr(int[] nums, int target){
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int low = 0;
        int min = Integer.MAX_VALUE;

        for(int high = 0; high < nums.length; high++){
            sum += nums[high];

            while(sum >= target){
                min = Math.min(min, high - low + 1);
                sum -= nums[low];
                low++;
            }
        }
        return min;
    }
    public static void main(String[] args){
        MinSizeSubArraySum mssas = new MinSizeSubArraySum();
        System.out.println(mssas.minSubArr(new int[]{1, 2, 4, 4},4));
    }
}
