public class RemoveDuplicate {
    public int remDup(int[]nums){
        int i = 0;
        int j = 1;
        int unique = 1;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[i + 1] = nums[j];
                i++;
                unique++;
            }
            j++;
        }
        return unique;
        
    }
    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        System.out.println(rd.remDup(new int[]{1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6}));;
    }
}
