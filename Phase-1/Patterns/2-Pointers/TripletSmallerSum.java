import java.util.*;
public class TripletSmallerSum {
    public int findTripLess(int[] nums, int target){
        Arrays.sort(nums);
        int count = 0;

        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum < target){
                    count += (right - left);
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        TripletSmallerSum tss = new TripletSmallerSum();
        System.out.println(tss.findTripLess(new int[]{5, 1, 3, 4, 7}, 12));
    }
}
