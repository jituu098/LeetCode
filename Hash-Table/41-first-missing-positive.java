class Solution {
    public int firstMissingPositive(int[] nums) {
        int start =0;
        while(start < nums.length){
            int correct  = nums[start] - 1;
            if (nums[start] > 0 && nums[start] <= nums.length && nums[start] != nums
            [correct]){
                // swap
                int temp = nums[start];
                nums[start] = nums[correct];
                nums[correct] = temp;
            } else{
                start ++;
            }
        }
        for (int i=0; i < nums.length; i++){
            if (nums[i] != i + 1){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}