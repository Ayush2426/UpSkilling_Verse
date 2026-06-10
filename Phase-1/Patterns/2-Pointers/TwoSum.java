public class TwoSum {
    public int findTwoSum(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int res = arr[i] + arr[j];
            if(res == target){
                return 1;
            }else if(res < target){
                i++;
            }else if(res > target){
                j--;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        ts.findTwoSum(new int[]{1, 2, 3, 6, 8, 9}, 7);
    }
}