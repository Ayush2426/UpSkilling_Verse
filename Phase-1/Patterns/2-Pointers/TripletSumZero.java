
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumZero {

    public List<List<Integer>> findTripZero(int[] nums) {
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             if((nums[i] + nums[j] + nums[k]) == 0){
        //                 return new int[]{nums[i], nums[j], nums[k]};
        //             }
        //         }
        //     }
        // }
        // return new int[]{-1, -1, -1};
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        TripletSumZero tsz = new TripletSumZero();
        System.out.println(tsz.findTripZero(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
