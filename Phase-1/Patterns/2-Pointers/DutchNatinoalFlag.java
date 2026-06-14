
import java.util.Arrays;

public class DutchNatinoalFlag {
    public int[] dutchNationalFlag(int[] nums){
        int left = 0, mid = 0, right = nums.length - 1;

        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, right);
                right--;
            }
        }
        return nums;
    }
    public int[] swap(int[] nums, int i, int j){
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
        return nums;
    }
    public static void main(String[] args){
        DutchNatinoalFlag dnf = new DutchNatinoalFlag();
        System.out.println(Arrays.toString(dnf.dutchNationalFlag(new int[]{2, 0, 1, 0, 1, 2})));
    }
}
