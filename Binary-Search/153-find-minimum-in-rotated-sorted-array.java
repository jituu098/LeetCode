class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end =  nums.length-1;
        while (start <= end){
            int mid  = start + (end-start)/2;
            // 4 cases
            if (mid < end &&  nums[mid] >  nums[mid + 1]){
                return nums[mid + 1];
            }
            if (mid > start &&  nums[mid] <  nums[mid-1]){
                return nums[mid];
            }
            if ( nums[mid] <=  nums[start]){
                end = mid - 1;
            }else{