class Solution {
    public int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != i+1){
                return new int[] {nums[i], i 
                + 1};
            }